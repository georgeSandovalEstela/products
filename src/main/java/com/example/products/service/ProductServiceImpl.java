package com.example.products.service;

import com.example.products.domain.Product;
import com.example.products.dto.request.ProductRequest;
import com.example.products.dto.request.ProductUpdateRequest;
import com.example.products.repository.ProductRepository;
import com.example.products.repository.StockRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    public final ProductRepository productRepository;
    public final StockRepository stockRepository;
    @Override
    public List<Product> findAllProduct() throws Exception {
        return productRepository.findAllByEstado(true);
    }

    @Override
    public Product findProductById(Long id) throws Exception {
        Optional<Product> product = productRepository.findById(id);
        if(!product.isPresent())
            return new Product();
        return productRepository.findById(id).get();
    }

    @Override
    public Product saveProduct(ProductRequest productRequest) throws Exception {
        return productRepository.save(productRequest.castModel());
    }

    @Override
    public Product updateProduct(ProductUpdateRequest productUpdateRequest)throws Exception{
        return  productRepository.save(productUpdateRequest.castModel());
    }

    @Override
    public Product deleteProduct(Long id) throws Exception {
        Product product= productRepository.findById(id).get();
        product.setEstado(false);
        return productRepository.save(product);
    }


}
