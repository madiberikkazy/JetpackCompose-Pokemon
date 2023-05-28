package com.example.experience3.data.remote.response

data class Pokemon(
    val abilities: List<com.example.experience3.data.remote.response.Ability>,
    val base_experience: Int,
    val forms: List<com.example.experience3.data.remote.response.Form>,
    val game_indices: List<com.example.experience3.data.remote.response.GameIndice>,
    val height: Int,
    val held_items: List<Any>,
    val id: Int,
    val is_default: Boolean,
    val location_area_encounters: String,
    val moves: List<com.example.experience3.data.remote.response.Move>,
    val name: String,
    val order: Int,
    val past_types: List<Any>,
    val species: com.example.experience3.data.remote.response.Species,
    val sprites: com.example.experience3.data.remote.response.Sprites,
    val stats: List<com.example.experience3.data.remote.response.Stat>,
    val types: List<com.example.experience3.data.remote.response.Type>,
    val weight: Int
)