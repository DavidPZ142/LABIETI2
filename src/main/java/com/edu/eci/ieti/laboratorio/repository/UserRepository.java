package com.edu.eci.ieti.laboratorio.repository;

import com.edu.eci.ieti.laboratorio.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {

}
