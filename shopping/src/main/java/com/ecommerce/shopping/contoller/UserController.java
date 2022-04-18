package com.ecommerce.shopping.contoller;

import com.ecommerce.shopping.entity.User;
import com.ecommerce.shopping.repository.UserRepository;
import com.ecommerce.shopping.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class UserController {
    @Autowired
    UserServiceImpl userService;

    @GetMapping("/user-by-id/{user_id}")
    public Optional<User> findByUserName(@PathVariable("user_id") Integer user_id) throws Exception {
        return userService.findByUserName(user_id);
    }

}
