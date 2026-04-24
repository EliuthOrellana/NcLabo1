package com.uca.nclabo1.repositories;

import com.uca.nclabo1.common.PokemonList;
import com.uca.nclabo1.domain.model.Pokemon;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class PokemonRepository {
    private final PokemonList pokemonList;

    public List<Pokemon> findAll() {
        return pokemonList.getPokemons();
    }
}
