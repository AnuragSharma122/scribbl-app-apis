package com.anurag.scribbl.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anurag.scribbl.entities.User;

public interface UserRepo extends JpaRepository<User, Integer> {

}
