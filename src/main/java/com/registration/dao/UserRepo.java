package com.registration.dao;

import org.springframework.data.repository.CrudRepository;

import com.registration.model.User;

public interface UserRepo extends CrudRepository<User, Integer> {

}
