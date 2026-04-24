package com.uca.nclabo1.domain.model;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Pokemon {
    private int id;
    private String nombre;
    private String Tipo;
    private String debilidades;
    private String zona;
    private String Region;
}
