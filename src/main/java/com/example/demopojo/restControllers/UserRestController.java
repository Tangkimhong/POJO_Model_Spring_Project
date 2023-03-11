package com.example.demopojo.restControllers;

import com.example.demopojo.models.User;
import com.example.demopojo.services.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
public class UserRestController {

    public UserService userService;

    public UserRestController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping( value = "", method = RequestMethod.GET)
    public List<User> getAll(){
        return userService.getAll();
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public boolean saveUser(@RequestBody User user){
        return this.userService.Save(user);
    }

    @RequestMapping(value = "", method = RequestMethod.PUT)
    public boolean updateUser(@RequestBody User user){
        return this.userService.update(user);
    }

    @RequestMapping(value = "/{user_id}", method = RequestMethod.DELETE)
    public boolean deleteUser(@PathVariable("user_id") Integer id){
        return this.userService.delete(id);
    }

}
