package com.redisApplication.RedisApplication.Controller;

import com.redisApplication.RedisApplication.Entity.User;
import com.redisApplication.RedisApplication.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/save")
    public String saveUser(@RequestBody User user) {
        userService.saveUser(user);
        return "User saved successfully!";
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable String id) {
        return userService.getUserById(id);
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable String id) {
        userService.deleteUserById(id);
        return "User deleted successfully!";
    }
}
