package com.http.httprequest.controller;

import com.http.httprequest.dto.UserDTO;
import com.http.httprequest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "api/v1/user")
@CrossOrigin
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/getUser")
    public String getUser(){
        return "pasindu iroshan";
    }

    @PostMapping(value = "/postUser")
    public UserDTO saveUser(@RequestBody UserDTO userDTO){
        return userService.saveUser(userDTO);
    }

    @PutMapping("/putUser")
    public String updateUser(){
        return "user updated";
    }

    @DeleteMapping("/deleteUser")
    public String deleteUser(){
        return "user deleted";
    }
}

