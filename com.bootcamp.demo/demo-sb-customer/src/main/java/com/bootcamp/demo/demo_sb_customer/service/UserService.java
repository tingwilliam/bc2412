package com.bootcamp.demo.demo_sb_customer.service;

import java.util.List;
import com.bootcamp.demo.demo_sb_customer.entity.CustomerEntity;
import com.bootcamp.demo.demo_sb_customer.entity.UserEntity;
import com.bootcamp.demo.demo_sb_customer.model.User;

public interface UserService {
  List<User> getUser();
  UserEntity createUser(UserEntity userEntity);
}