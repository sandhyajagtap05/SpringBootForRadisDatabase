package com.redisApplication.RedisApplication.Service;

import com.redisApplication.RedisApplication.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;


@Service
public class UserService {

    @Autowired
    private RedisTemplate<String, User> redisTemplate;

    private static final String USER_KEY_PREFIX = "User:";

    // Save a User entity
    public void saveUser(User user) {
        redisTemplate.opsForValue().set(USER_KEY_PREFIX + user.getId(), user);

        System.out.println("savesd user:"+user);
    }

    // Retrieve a User entity by ID
    public User getUserById(String id) {
        User user= redisTemplate.opsForValue().get(USER_KEY_PREFIX + id);
        System.out.println("retrived data:"+user);
          return user;


    }

    // Delete a User entity by ID
    public void deleteUserById(String id) {
        redisTemplate.delete(USER_KEY_PREFIX + id);
    }
}
