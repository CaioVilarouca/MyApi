package com.caio.myapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.caio.myapi.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{
}
