package com.lucasms.projforum.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.lucasms.projforum.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
