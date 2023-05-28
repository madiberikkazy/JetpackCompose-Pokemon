package com.example.experience3.data.remote.response

data class PokemonList(
    val count: Int,
    val next: String,
    val previous: Any,
    val results: List<com.example.experience3.data.remote.response.Result>
)