package com.example.products.service;

import com.example.products.domain.Product;
import com.example.products.domain.Stock;
import com.example.products.dto.internal.StockProduct;
import com.example.products.dto.request.ProductRequest;
import com.example.products.dto.request.ProductUpdateRequest;

import java.util.List;

public interface ProductService {

   List<Product> findAllProduct()throws Exception;

   Product findProductById(Long id)throws Exception;

   Product saveProduct(ProductRequest productRequest)throws Exception;

   Product updateProduct(ProductUpdateRequest productUpdateRequest)throws Exception;

   Product deleteProduct(Long id)throws Exception;

}
