package com.example.demopojo.services.impl;

import com.example.demopojo.models.User;
import com.example.demopojo.repositories.UserRepository;
import com.example.demopojo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImplementation implements UserService {

    @Autowired
    public UserRepository userRepository;

    @Override
    public List<User> getAll() {
        return userRepository.getAll();
    }

    @Override
    public User getOne(Integer id) {
        return userRepository.getOne(id);
    }

    @Override
    public boolean Save(User user) {
        return userRepository.save(user);
    }

    @Override
    public boolean update(User user) {
        return userRepository.update(user);
    }

    @Override
    public boolean delete(Integer id) {
        return userRepository.delete(id);
    }
}
