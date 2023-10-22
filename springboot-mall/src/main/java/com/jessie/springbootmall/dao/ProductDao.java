package com.jessie.springbootmall.dao;

import com.jessie.springbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);
}
