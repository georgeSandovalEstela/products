package com.example.products.controller;


import com.example.products.domain.Stock;
import com.example.products.dto.internal.StockProduct;
import com.example.products.service.StockService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/stock")
@RequiredArgsConstructor
@CrossOrigin
public class StockController {
    final StockService stockService;

    @GetMapping("/lista")
    public ResponseEntity<List<Stock>> stockProduct()throws Exception{
        return ResponseEntity.ok(stockService.findAllStock());
    }

    @GetMapping("/{tipo}")
    public ResponseEntity<List<StockProduct>> stockFilter(@PathVariable() String tipo)throws Exception{
        return ResponseEntity.ok(stockService.stockFilter(tipo));
    }

}
