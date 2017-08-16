package com.ovenko.service;

import com.ovenko.dao.UserDao;
import com.ovenko.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public User getUser(Long id){
        return userDao.findOne(id);
    }

    public List<User> getAllUsers(){
        List<User> users = new ArrayList<>();
        userDao.findAll().forEach(users::add);
        return users;
    }
    public User addUser(User user){
        return userDao.save(user);
    }

    public void updateUser(User user){
        userDao.save(user);
    }

    public void deleteUser(Long id){
        userDao.delete(id);
    }



}
