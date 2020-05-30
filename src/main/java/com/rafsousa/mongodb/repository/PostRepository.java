package com.rafsousa.mongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.rafsousa.mongodb.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

}
