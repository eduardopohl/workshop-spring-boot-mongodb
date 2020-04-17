package com.eduardopohl.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.eduardopohl.workshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
