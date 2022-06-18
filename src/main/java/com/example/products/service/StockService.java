package com.example.products.service;

import com.example.products.domain.Stock;
import com.example.products.dto.internal.StockProduct;

import java.util.List;

public interface StockService {

   List<Stock> findAllStock()throws Exception;

   List<StockProduct> stockFilter(String tipo)throws Exception;
}
