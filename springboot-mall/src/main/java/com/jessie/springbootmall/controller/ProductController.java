package com.jessie.springbootmall.controller;

import com.jessie.springbootmall.dto.ProductRequest;
import com.jessie.springbootmall.model.Product;
import com.jessie.springbootmall.service.ProductService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

//  查詢商品
    @GetMapping("/products/{productId}")
//    這是回傳一個product類型的json
    public ResponseEntity<Product> getProduct(@PathVariable Integer productId) {
//        當前端來請求url路徑，那就會透過productService的getProductById的方法，去資料庫中查詢這筆商品的數據出來
        Product product = productService.getProductById(productId);

//        那這筆數據不是NULL的話，那就表示有查到這筆商品的數據
        if (product != null) {
//          回傳狀態是200，把有取道的值回傳給前端
            return ResponseEntity.status(HttpStatus.OK).body(product);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

//  新增商品
    @PostMapping("/products")
    public ResponseEntity<Product> createProduct(@RequestBody @Valid ProductRequest productRequest) {
//      實作可以先從dao層開始再到controller層，或是從controller層實作進去
        Integer productId = productService.createProduct(productRequest);

        Product product = productService.getProductById(productId);

        return ResponseEntity.status(HttpStatus.CREATED).body(product);
    }
}
