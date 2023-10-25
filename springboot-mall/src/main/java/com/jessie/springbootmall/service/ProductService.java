package com.jessie.springbootmall.service;

import com.jessie.springbootmall.dto.ProductRequest;
import com.jessie.springbootmall.model.Product;

public interface ProductService {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);
}
