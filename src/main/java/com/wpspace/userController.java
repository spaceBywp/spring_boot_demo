package com.wpspace;

/**
 * Created by wp on 2016/6/10.
 */
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/")
public class UserController {
    @RequestMapping(value = "/users/{username}")
    public String userProfile(@PathVariable(value = "username") String username) {
        return String.format("user %s", username);
    }

    @RequestMapping(value = "/posts/{id}")
    public String post(@PathVariable(value = "id") int id) {
        return String.format("post %d", id);
    }
}