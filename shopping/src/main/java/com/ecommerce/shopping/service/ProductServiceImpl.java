package com.ecommerce.shopping.service;

import com.ecommerce.shopping.entity.Product;
import com.ecommerce.shopping.entity.User;
import com.ecommerce.shopping.repository.ProductRepository;
import com.ecommerce.shopping.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductServiceImpl {

    @Autowired
    ProductRepository productRepository;


    public Optional<Product> findByProductId(Integer user_id) throws Exception {
        return productRepository.findById(user_id);
    }
}