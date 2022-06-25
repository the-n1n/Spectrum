﻿$entries = @{
    "coal" = "minecraft:coal"
    "copper" = "minecraft:copper"
    "diamond" = "minecraft:diamond"
    "emerald" = "minecraft:emerald"
    "glowstone" = "minecraft:glowstone"
    "gold" = "minecraft:gold_ingot"
    "iron" = "minecraft:iron_ingot"
    "lapis" = "minecraft:lapis_lazuli"
    "netherite" = "minecraft:netherite_ingot"
    "prismarine" = "minecraft:prismarine_crystals"
    "quartz" = "minecraft:quartz"
    "redstone" = "minecraft:redstone"
    "certus_quartz" = "ae2:certus_quartz"
    "fluix" = "ae2:fluix_crystal"
    "globette" = "gobber2:globette_cluster"
    "globette_nether" = "gobber2:globette_nether_cluster"
    "globette_end" = "gobber2:globette_end_cluster"
}


foreach($entry in $entries.GetEnumerator()) {
    $name = $entry.Key
    $res = $entry.Value

    New-Item -Path ".\loot\small_$name`_bud.json" -ItemType File -Force -Value @"
{
  "type": "minecraft:block",
  "pools": [
    {
      "rolls": 1,
      "bonus_rolls": 0,
      "entries": [
        {
          "type": "minecraft:item",
          "name": "$res"
        }
      ],
      "conditions": [
        {
          "condition": "minecraft:survives_explosion"
        }
      ]
    }
  ]
}
"@


    New-Item -Path ".\loot\$name`_cluster.json" -ItemType File -Force -Value @"
{
  "type": "minecraft:block",
  "pools": [
    {
      "rolls": 1,
      "bonus_rolls": 0,
      "entries": [
        {
          "type": "minecraft:item",
          "name": "$res"
        }
      ],
      "functions": [
        {
          "function": "minecraft:set_count",
          "count": {
            "min": 5,
            "max": 7
          }
        }
      ],
      "conditions": [
        {
          "condition": "minecraft:survives_explosion"
        }
      ]
    }
  ]
}
"@


    New-Item -Path ".\anvil_crushing\native_$name`_from_small_$name`_bud.json" -ItemType File -Force -Value @"
{
  "type": "spectrum:anvil_crushing",
  "ingredient": {
    "item": "spectrum:small_$name`_bud"
  },
  "crushedItemsPerPointOfDamage": 0.75,
  "experience": 2.0,
  "result": {
    "item": "spectrum:native_$name",
    "count": 1
  },
  "particleEffectIdentifier": "explosion",
  "soundEventIdentifier": "block.amethyst_cluster.break"
}
"@

    New-Item -Path ".\anvil_crushing\native_$name`_from_medium_$name`_bud.json" -ItemType File -Force -Value @"
{
  "type": "spectrum:anvil_crushing",
  "ingredient": {
    "item": "spectrum:medium_$name`_bud"
  },
  "crushedItemsPerPointOfDamage": 0.75,
  "experience": 2.0,
  "result": {
    "item": "spectrum:native_$name",
    "count": 2
  },
  "particleEffectIdentifier": "explosion",
  "soundEventIdentifier": "block.amethyst_cluster.break"
}
"@

    New-Item -Path ".\anvil_crushing\native_$name`_from_large_$name`_bud.json" -ItemType File -Force -Value @"
{
  "type": "spectrum:anvil_crushing",
  "ingredient": {
    "item": "spectrum:large_$name`_bud"
  },
  "crushedItemsPerPointOfDamage": 0.75,
  "experience": 2.0,
  "result": {
    "item": "spectrum:native_$name",
    "count": 3
  },
  "particleEffectIdentifier": "explosion",
  "soundEventIdentifier": "block.amethyst_cluster.break"
}
"@

    New-Item -Path ".\anvil_crushing\native_$name`_from_$name`_cluster.json" -ItemType File -Force -Value @"
{
  "type": "spectrum:anvil_crushing",
  "ingredient": {
    "item": "$name`_cluster"
  },
  "crushedItemsPerPointOfDamage": 0.75,
  "experience": 2.0,
  "result": {
    "item": "spectrum:native_$name",
    "count": 6
  },
  "particleEffectIdentifier": "explosion",
  "soundEventIdentifier": "block.amethyst_cluster.break"
}
"@


    New-Item -Path ".\item_models\native_$name`.json" -ItemType File -Force -Value @"
{
  "parent": "minecraft:item/generated",
  "textures": {
    "layer0": "spectrum:item/native_$name"
  }
}
"@




}


foreach($entry in $entries.GetEnumerator()) {
    $name = $entry.Key
    "public static final Item $("NATIVE_" + $name.toUpper()) = new Item(resourcesItemSettings);"
}

foreach($entry in $entries.GetEnumerator()) {
    $name = $entry.Key
    "register(`"native_$name`", $("NATIVE_"+ $name.toUpper()), DyeColor.XXX);"
}

foreach($entry in $entries.GetEnumerator()) {
    $name = $entry.Key
    "`"item.spectrum.native_$name`": `"Native $name`","
}