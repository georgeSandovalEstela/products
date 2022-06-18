package com.example.products.service;

import com.example.products.domain.Stock;
import com.example.products.dto.internal.StockProduct;
import com.example.products.repository.StockRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@Service
@RequiredArgsConstructor
@CrossOrigin
public class StockServiceImpl implements StockService {

    public final StockRepository stockRepository;

    @Override
    public List<Stock> findAllStock() throws Exception {
        return stockRepository.findAll();
    }

    @Override
    public List<StockProduct> stockFilter(String tipo) throws Exception {
        List<StockProduct> stockProducts=stockRepository.stockProducto(tipo);
        System.out.println("\nCantidad : "+stockProducts.size());
        return stockProducts;
    }


}
