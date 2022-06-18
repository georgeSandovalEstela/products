package com.example.products.dto.internal;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class StockProduct {
    private Long id;
    private Integer cantidad;
    private String codigo;
    private String nombre;
    private String tipo;
    private float precio;
    private Boolean estado;

}
