package com.example.springsecurity.repositories;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.springsecurity.helpers.RefreshableCRUDRepository;
import com.example.springsecurity.models.UserInfo;

@Repository
public interface UserRepository extends RefreshableCRUDRepository<UserInfo, Long> {

   UserInfo findByUsername(String username);
   UserInfo findFirstById(Long id);

   List<UserInfo> findAll();
}
