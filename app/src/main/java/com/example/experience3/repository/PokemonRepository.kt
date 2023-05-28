package com.example.experience3.repository

import com.example.experience3.data.remote.PokeApi
import com.example.experience3.data.remote.response.PokemonList
import com.example.experience3.util.Resource
import dagger.hilt.android.scopes.ActivityScoped
import java.lang.Exception
import javax.inject.Inject

@ActivityScoped
class PokemonRepository @Inject constructor(
    private val api: PokeApi
) {

    suspend fun getPokemonList(limit: Int, i: Int): Resource<PokemonList> {
        val response = try {
            api.getPokenmonList(limit, i)
        } catch (e: Exception) {
            return Resource.Error("An unknown error occured")
        }
        return Resource.Success(response)
    }

    suspend fun getPokemonInfo(PokemonName: String): Resource<com.example.experience3.data.remote.response.Pokemon> {
        val response = try {
            api.getPokemonInfo(PokemonName)
        } catch (e: Exception) {
            return Resource.Error("An unknown error occured")
        }
        return Resource.Success(response)
    }
}