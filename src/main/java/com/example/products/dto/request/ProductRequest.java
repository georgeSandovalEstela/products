package com.example.products.dto.request;


import com.example.products.domain.Product;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ProductRequest {

    private String codigo;
    private String nombre;
    private String tipo;
    private float precio;

    public Product castModel(){
        return new Product(null,codigo,nombre,tipo,precio,true);
    }

}
