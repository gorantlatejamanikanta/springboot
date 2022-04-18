package com.ecommerce.shopping.repository;

import com.ecommerce.shopping.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
