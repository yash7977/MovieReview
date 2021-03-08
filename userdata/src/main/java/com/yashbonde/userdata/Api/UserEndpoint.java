package com.yashbonde.userdata.Api;

import com.yashbonde.userdata.Model.User;
import com.yashbonde.userdata.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.io.IOException;

@RestController()
@RequestMapping("/user")
public class UserEndpoint {

    @Autowired
    private UserService userService;

    @PostMapping("/addUser")
    public User addUser(@RequestBody User user) throws IOException {
        return userService.createUser(user);
    }

    @GetMapping("/getUser")
    public User addUser(@RequestParam("userName") String userName){
        return userService.getUser(userName);
    }

}
