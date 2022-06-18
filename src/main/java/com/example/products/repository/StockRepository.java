package com.example.products.repository;

import com.example.products.domain.Stock;
import com.example.products.dto.internal.StockProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface StockRepository extends JpaRepository<Stock,Long> {

    @Query(value = "select " +
            "new com.example.products.dto.internal.StockProduct(" +
            "s.id, s.cantidad, s.idProducto.codigo" +
            ", s.idProducto.nombre, s.idProducto.tipo, s.idProducto.precio, s.idProducto.estado) " +
            "from Stock s where s.idProducto.tipo=:tipo")
    List<StockProduct> stockProducto(@Param("tipo") String tipo)throws Exception;
}