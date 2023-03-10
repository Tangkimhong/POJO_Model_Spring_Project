package com.example.demopojo.repositories;

import com.example.demopojo.models.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {

    List<User> userList = new ArrayList<>();

    {
        userList.add(new User(1,"Dara","male"));
        userList.add(new User(2,"Khanha","female"));
        userList.add(new User(3,"Tola","male"));
        userList.add(new User(4,"Thida","female"));
        userList.add(new User(5,"Leng yi","female"));
    }

    public List<User> getAll(){
        return userList;
    }

    public User getOne(Integer id){

        for (User u : userList) {
            Integer userId = u.getId();
            if (userId.equals(id)){
                return u;
            }
        }

        return null;
    }

}
