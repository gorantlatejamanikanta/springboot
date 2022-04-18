package com.ecommerce.shopping.contoller;

import com.ecommerce.shopping.entity.Product;
import com.ecommerce.shopping.service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class ProductController {
    @Autowired
    ProductServiceImpl productService;

    @GetMapping("/product-by-id/{product_id}")
    public Optional<Product> findByUserName(@PathVariable("product_id") Integer product_id) throws Exception {
        return productService.findByProductId(product_id);
    }

}
