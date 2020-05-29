package com.rafsousa.mongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.rafsousa.mongodb.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
