package com.uca.nclabo1.components;

import com.uca.nclabo1.domain.model.Pokemon;
import com.uca.nclabo1.services.PokemonService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor

public class PokemonFilterComponent implements ApplicationRunner {
    private final PokemonService pokemonService;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        filterByTypeOperation();

        filterByZoneOperation();

        filterByWeaknessOperation();
    }
    public void filterByTypeOperation() {

        List<Pokemon> firePokemon = pokemonService.filterByType("Fire");
        if (firePokemon.isEmpty()) {
        } else {
            firePokemon.forEach(pokemon ->
                System.out.println("  • " + pokemon.getNombre() + " - Debilidades: " + pokemon.getDebilidades())
            );
        }

    }


    public void filterByZoneOperation() {

        List<Pokemon> route1Pokemon = pokemonService.filterByZone("Route 1");
        if (route1Pokemon.isEmpty()) {
            System.out.println("  No se encontraron pokémons en Route 1");
        } else {
            route1Pokemon.forEach(pokemon ->
                    System.out.println("  • " + pokemon.getNombre() + " (" + pokemon.getTipo() + ")")
            );
        }
    }


    public void filterByWeaknessOperation() {

        List<Pokemon> waterWeakness = pokemonService.filterByWeakness("Water");
        if (waterWeakness.isEmpty()) {
            System.out.println("  No se encontraron ppokemos con debilidad a Water");
        } else {
            waterWeakness.forEach(pokemon ->
                    System.out.println("  • " + pokemon.getNombre() + " - Tipo: " + pokemon.getTipo() + ", Zona: " + pokemon.getZona())
            );
        }

}}

