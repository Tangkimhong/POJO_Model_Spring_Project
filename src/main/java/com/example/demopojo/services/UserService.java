package com.example.demopojo.services;

import com.example.demopojo.models.User;


import java.util.List;

public interface UserService {

    List<User> getAll();

    User getOne(Integer id);

    void Save(User user);
}
