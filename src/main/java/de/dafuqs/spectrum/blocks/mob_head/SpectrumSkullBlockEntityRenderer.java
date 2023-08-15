package de.dafuqs.spectrum.blocks.mob_head;

import com.google.common.collect.ImmutableBiMap;
import com.google.common.collect.ImmutableMap;
import de.dafuqs.spectrum.SpectrumCommon;
import de.dafuqs.spectrum.blocks.mob_head.models.*;
import de.dafuqs.spectrum.entity.render.*;
import de.dafuqs.spectrum.registries.client.SpectrumModelLayers;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.block.BlockState;
import net.minecraft.block.SkullBlock;
import net.minecraft.block.WallSkullBlock;
import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.block.entity.BlockEntityRenderer;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactory;
import net.minecraft.client.render.block.entity.SkullBlockEntityModel;
import net.minecraft.client.render.entity.model.EntityModelLayers;
import net.minecraft.client.render.entity.model.EntityModelLoader;
import net.minecraft.client.render.entity.model.SkullEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.Pair;
import net.minecraft.util.math.Direction;
import org.jetbrains.annotations.Nullable;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

@Environment(EnvType.CLIENT)
public class SpectrumSkullBlockEntityRenderer implements BlockEntityRenderer<SpectrumSkullBlockEntity> {

    private static SkullBlockEntityModel PLAYER;

    private static Map<SkullBlock.SkullType, Pair<SkullBlockEntityModel, Identifier>> MODELS = new HashMap<>();

    public SpectrumSkullBlockEntityRenderer(BlockEntityRendererFactory.Context renderContext) {
        MODELS = getModels(renderContext.getLayerRenderDispatcher());
    }

    public static Map<SkullBlock.SkullType, Pair<SkullBlockEntityModel, Identifier>> getModels(EntityModelLoader modelLoader) {
        ImmutableMap.Builder<SkullBlock.SkullType, Pair<SkullBlockEntityModel, Identifier>> builder = ImmutableBiMap.builder();

        PLAYER = new SkullEntityModel(modelLoader.getModelPart(EntityModelLayers.PLAYER_HEAD));
        builder.put(SkullBlock.Type.PLAYER, new Pair<>(PLAYER, null));

        builder.put(SpectrumSkullBlockType.ENDERMITE, new Pair<>(new EndermiteHeadModel(modelLoader.getModelPart(SpectrumModelLayers.ENDERMITE_HEAD)), new Identifier("textures/entity/endermite.png")));
        builder.put(SpectrumSkullBlockType.EGG_LAYING_WOOLY_PIG, new Pair<>(new EggLayingWoolyPigHeadModel(modelLoader.getModelPart(SpectrumModelLayers.EGG_LAYING_WOOLY_PIG_HEAD)), EggLayingWoolyPigEntityRenderer.TEXTURE));
        builder.put(SpectrumSkullBlockType.MONSTROSITY, new Pair<>(new MonstrosityHeadModel(modelLoader.getModelPart(SpectrumModelLayers.MONSTROSITY_HEAD)), MonstrosityEntityRenderer.TEXTURE));
        builder.put(SpectrumSkullBlockType.KINDLING, new Pair<>(new KindlingHeadModel(modelLoader.getModelPart(SpectrumModelLayers.KINDLING_HEAD)), KindlingEntityRenderer.TEXTURE));
        builder.put(SpectrumSkullBlockType.LIZARD, new Pair<>(new LizardHeadModel(modelLoader.getModelPart(SpectrumModelLayers.LIZARD_HEAD)), LizardEntityRenderer.TEXTURE));
        builder.put(SpectrumSkullBlockType.PRESERVATION_TURRET, new Pair<>(new PreservationTurretHeadModel(modelLoader.getModelPart(SpectrumModelLayers.PRESERVATION_TURRET_HEAD)), PreservationTurretEntityRenderer.TEXTURE));
        builder.put(SpectrumSkullBlockType.WARDEN, new Pair<>(new WardenHeadModel(modelLoader.getModelPart(SpectrumModelLayers.WARDEN_HEAD)), new Identifier("textures/entity/warden/warden.png")));

        return builder.build();
    }

    public static SkullBlockEntityModel getModel(SkullBlock.SkullType skullType) {
        if (MODELS.containsKey(skullType)) {
            return MODELS.get(skullType).getLeft();
        } else {
            return PLAYER;
        }
    }

    @Override
    public void render(SpectrumSkullBlockEntity spectrumSkullBlockEntity, float f, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int light, int j) {
        BlockState blockState = spectrumSkullBlockEntity.getCachedState();
        Direction direction = null;
        float yaw = 22.5F;
        if (blockState.getBlock() instanceof WallSkullBlock) {
            direction = blockState.get(WallSkullBlock.FACING);
            yaw *= (2 + direction.getHorizontal()) * 4;
        } else {
            yaw *= blockState.get(SkullBlock.ROTATION);
        }
        SpectrumSkullBlockType skullType = spectrumSkullBlockEntity.getSkullType();
        if (skullType == null) {
            skullType = SpectrumSkullBlockType.PIG;
        }
        SkullBlockEntityModel model = PLAYER;
        if (MODELS.containsKey(skullType)) {
            model = MODELS.get(skullType).getLeft();
        }

        RenderLayer renderLayer = getRenderLayer(skullType);
        renderSkull(direction, yaw, 0, matrixStack, vertexConsumerProvider, light, model, renderLayer);
    }

    public static void renderSkull(@Nullable Direction direction, float yaw, float animationProgress, MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, SkullBlockEntityModel model, RenderLayer renderLayer) {
        matrices.push();
        if (direction == null) {
            matrices.translate(0.5D, 0.0D, 0.5D);
        } else {
            matrices.translate((0.5F - (float) direction.getOffsetX() * 0.25F), 0.25D, (0.5F - (float) direction.getOffsetZ() * 0.25F));
        }

        matrices.scale(-1.0F, -1.0F, 1.0F);
        VertexConsumer vertexConsumer = vertexConsumers.getBuffer(renderLayer);
        model.setHeadRotation(animationProgress, yaw, 0.0F);
        model.render(matrices, vertexConsumer, light, OverlayTexture.DEFAULT_UV, 1.0F, 1.0F, 1.0F, 1.0F);
        matrices.pop();
    }

    public static RenderLayer getRenderLayer(SpectrumSkullBlockType type) {
        Identifier identifier = getTextureIdentifier(type);
        RenderLayer renderLayer = RenderLayer.getEntityCutoutNoCullZOffset(identifier);
        if (renderLayer == null) {
            return RenderLayer.getEntityCutoutNoCullZOffset(new Identifier("textures/entity/zombie/zombie.png"));
        } else {
            return renderLayer;
        }
    }

    protected static Identifier getTextureIdentifier(SpectrumSkullBlockType type) {
        if (MODELS.containsKey(type)) {
            return MODELS.get(type).getRight();
        } else {
            return SpectrumCommon.locate("textures/entity/mob_head/" + type.toString().toLowerCase(Locale.ROOT) + ".png");
        }
    }

}