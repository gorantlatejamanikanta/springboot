package com.ecommerce.shopping.service;

import com.ecommerce.shopping.entity.User;
import com.ecommerce.shopping.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class UserServiceImpl {

    @Autowired
    UserRepository userRepository;


    public Optional<User> findByUserName(Integer user_id) throws Exception {
        return  userRepository.findById(user_id);
    }
}