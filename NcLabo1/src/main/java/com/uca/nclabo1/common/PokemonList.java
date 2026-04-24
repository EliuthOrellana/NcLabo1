package com.uca.nclabo1.common;

import com.uca.nclabo1.domain.model.Pokemon;
import com.uca.nclabo1.domain.model.Pokemon.PokemonBuilder;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PokemonList {
    private final List<Pokemon> pokemons;

    public PokemonList() {
        this.pokemons = new ArrayList<>();

        this.pokemons.add(Pokemon.builder()
                .id(1)
                .nombre("Bulbasaur")
                .Tipo("Grass/Poison")
                .debilidades("Fire, Ice, Flying, Psychic")
                .zona("Route 1")
                .Region("Kanto")
                .build());

        this.pokemons.add(Pokemon.builder()
                .id(4)
                .nombre("Charmander")
                .Tipo("Fire")
                .debilidades("Water, Ground, Rock")
                .zona("Route 24")
                .Region("Kanto")
                .build());

        this.pokemons.add(Pokemon.builder()
                .id(7)
                .nombre("Squirtle")
                .Tipo("Water")
                .debilidades("Electric, Grass")
                .zona("Route 24")
                .Region("Kanto")
                .build());

        this.pokemons.add(Pokemon.builder()
                .id(25)
                .nombre("Pikachu")
                .Tipo("Electric")
                .debilidades("Ground")
                .zona("Viridian Forest")
                .Region("Kanto")
                .build());

        this.pokemons.add(Pokemon.builder()
                .id(39)
                .nombre("Jigglypuff")
                .Tipo("Normal/Fairy")
                .debilidades("Fighting, Poison")
                .zona("Route 3")
                .Region("Kanto")
                .build());
    }

    public List<Pokemon> getPokemons() {
        return this.pokemons;
    }
}
