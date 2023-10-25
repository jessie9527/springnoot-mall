package com.jessie.springbootmall.dao;

import com.jessie.springbootmall.dto.ProductRequest;
import com.jessie.springbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

}
