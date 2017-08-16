package com.ovenko.dao;

import com.ovenko.model.User;
import org.springframework.data.repository.CrudRepository;


public interface UserDao extends CrudRepository<User, Long> {

}
