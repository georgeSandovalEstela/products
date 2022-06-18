package com.example.products.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;


@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "stock",schema = "public")
public class Stock implements Serializable {
    private static final long seriaVersionUID= 1l;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;
    private  Integer cantidad;
    private Boolean estado;

    @JoinColumn(name="id_producto" ,referencedColumnName = "id")
    @ManyToOne
    private Product idProducto;

}
