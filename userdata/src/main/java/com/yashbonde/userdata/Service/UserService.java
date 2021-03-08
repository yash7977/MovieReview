package com.yashbonde.userdata.Service;

import com.yashbonde.userdata.Model.User;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.io.IOException;

public interface UserService {
     User createUser(User user) throws IOException;
     User getUser(String userName);
}
