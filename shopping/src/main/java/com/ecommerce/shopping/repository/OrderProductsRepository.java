package com.ecommerce.shopping.repository;

import com.ecommerce.shopping.entity.OrderProducts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderProductsRepository extends JpaRepository<OrderProducts, Integer> {

}
