package com.yashbonde.userdata.Service.Impl;

import com.yashbonde.userdata.Model.User;
import com.yashbonde.userdata.Service.UserService;
import org.springframework.stereotype.Component;

import java.awt.event.FocusEvent;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Component
public class UserServiceImpl implements UserService {

    Map<String,User> map = new HashMap<>();

    @Override
    public User createUser(User user) throws IOException {
        if(!map.containsKey(user.getUserName())){
            user.setId(Long.valueOf(map.size()));
            map.put(user.getUserName(),user);
        }else{
            throw new IOException("User already exists");
        }
        return user;
    }

    @Override
    public User getUser(String userName) {
        if(map.containsKey(userName)){
            return map.get(userName);
        }
        return null;
    }
}
