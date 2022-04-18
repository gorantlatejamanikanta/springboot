package com.ecommerce.shopping.repository;

import com.ecommerce.shopping.entity.SalesTransaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalesTransactionRepository extends JpaRepository<SalesTransaction, Integer> {

}
