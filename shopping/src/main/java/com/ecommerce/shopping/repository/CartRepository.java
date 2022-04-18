package com.ecommerce.shopping.repository;

import com.ecommerce.shopping.entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart, Integer> {

}
