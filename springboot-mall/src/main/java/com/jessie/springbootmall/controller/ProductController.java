package com.jessie.springbootmall.controller;

import com.jessie.springbootmall.model.Product;
import com.jessie.springbootmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

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
}
