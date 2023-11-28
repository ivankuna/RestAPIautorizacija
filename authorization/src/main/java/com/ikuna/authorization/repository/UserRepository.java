package com.ikuna.authorization.repository;

import com.ikuna.authorization.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
}
