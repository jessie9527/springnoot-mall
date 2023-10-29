package com.jessie.springbootmall.service;

import com.jessie.springbootmall.dto.ProductQueryParams;
import com.jessie.springbootmall.dto.ProductRequest;
import com.jessie.springbootmall.model.Product;

import java.util.List;

public interface ProductService {

    List<Product> getProducts(ProductQueryParams productQueryParams);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
