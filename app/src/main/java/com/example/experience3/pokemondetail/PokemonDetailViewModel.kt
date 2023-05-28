package com.example.experience3.pokemondetail

import androidx.lifecycle.ViewModel
import com.example.experience3.data.remote.response.Pokemon
import com.example.experience3.repository.PokemonRepository
import com.example.experience3.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class PokemonDetailViewModel @Inject constructor(
    private val repository: PokemonRepository
) : ViewModel() {
    suspend fun getPokemonInfo(pokemonName: String):Resource<Pokemon>{
return repository.getPokemonInfo(pokemonName)
    }
}