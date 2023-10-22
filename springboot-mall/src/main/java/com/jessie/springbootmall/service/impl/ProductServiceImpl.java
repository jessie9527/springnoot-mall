package com.jessie.springbootmall.service.impl;

import com.jessie.springbootmall.dao.ProductDao;
import com.jessie.springbootmall.model.Product;
import com.jessie.springbootmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public Product getProductById(Integer productId) {
        return productDao.getProductById(productId);
    }
}
