package com.ecommerce.shopping.repository;

import com.ecommerce.shopping.entity.Cart;
import com.ecommerce.shopping.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Integer> {

}
