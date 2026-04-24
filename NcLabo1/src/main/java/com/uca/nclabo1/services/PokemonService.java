package com.uca.nclabo1.services;

import com.uca.nclabo1.domain.model.Pokemon;
import com.uca.nclabo1.repositories.PokemonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PokemonService {
    private final PokemonRepository pokemonRepository;

    public List<Pokemon> getAllPokemons() {
        return pokemonRepository.findAll();
    }


    public List<Pokemon> filterByType(String tipo) {
        return pokemonRepository.findAll().stream()
                .filter(pokemon -> pokemon.getTipo().equalsIgnoreCase(tipo))
                .collect(Collectors.toList());
    }

    public List<Pokemon> filterByZone(String zona) {
        return pokemonRepository.findAll().stream()
                .filter(pokemon -> pokemon.getZona().equalsIgnoreCase(zona))
                .collect(Collectors.toList());
    }

    public List<Pokemon> filterByWeakness(String debilidad) {
        return pokemonRepository.findAll().stream()
                .filter(pokemon -> pokemon.getDebilidades().toLowerCase().contains(debilidad.toLowerCase()))
                .collect(Collectors.toList());
    }
}
