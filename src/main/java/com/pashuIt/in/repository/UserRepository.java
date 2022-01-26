package com.pashuIt.in.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.pashuIt.in.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
