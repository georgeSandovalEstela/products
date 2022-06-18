package com.example.products.controller;


import com.example.products.domain.Product;
import com.example.products.domain.Stock;
import com.example.products.dto.request.ProductRequest;
import com.example.products.dto.request.ProductUpdateRequest;
import com.example.products.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping("api/v1/products")
@RequiredArgsConstructor
@CrossOrigin
public class ProductController {
    final ProductService productService;

    @GetMapping("/lista")
    public ResponseEntity<List<Product>> findAll()throws Exception{
        List<Product> products= productService.findAllProduct();
        return ResponseEntity.ok(products);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> findProduct(@PathVariable() Long id)throws Exception{
        Product products= productService.findProductById(id);
        return ResponseEntity.ok(products);
    }

    @GetMapping("")
    public ResponseEntity<Product> findProduct2(@RequestParam Long id)throws Exception{
        Product products= productService.findProductById(id);
        return ResponseEntity.ok(products);
    }

    @GetMapping("/forma3")
    public ResponseEntity<Product> findProduct3(@PathParam("id") Long id)throws Exception{
        Product products= productService.findProductById(id);
        return ResponseEntity.ok(products);
    }

    @PostMapping("/save")
    public ResponseEntity<Product> saveProduct(@RequestBody ProductRequest productRequest )throws Exception{
        Product products=productService.saveProduct(productRequest);
        return ResponseEntity.ok(products);
    }

    @PutMapping("/update")
    public ResponseEntity<Product> updateProduct(@RequestBody ProductUpdateRequest productUpdateRequest)throws Exception{
        Product products= productService.updateProduct(productUpdateRequest);
        return ResponseEntity.ok(products);
    }

    @PutMapping("/delete/{id}")
    public ResponseEntity<Product> deleteProduct(@PathVariable Long id)throws Exception{
        Product products= productService.deleteProduct(id);
        return ResponseEntity.ok(products);
    }

}
