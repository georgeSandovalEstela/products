package com.example.products.dto.request;


import com.example.products.domain.Product;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ProductUpdateRequest {
    private long  id;
    private String codigo;
    private String nombre;
    private String tipo;
    private float precio;
    private Boolean estado;

    public Product castModel(){
        return new Product(id,codigo,nombre,tipo,precio,estado);
    }

}
