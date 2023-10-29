package com.jessie.springbootmall.dao;

import com.jessie.springbootmall.constant.ProductCategory;
import com.jessie.springbootmall.dto.ProductRequest;
import com.jessie.springbootmall.model.Product;

import java.util.List;

public interface ProductDao {

    List<Product> getProducts(ProductCategory category, String search);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);

}
