package com.example.springtest.controller;


import com.example.springtest.model.DTO.UserDTO;
import com.example.springtest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {
    @Autowired
    private UserService userService;

    @GetMapping(value = "/users")
    public ResponseEntity<?> getListUser() {
        List<UserDTO> users = userService.getListUser();
        return ResponseEntity.ok(users);
    }

    @GetMapping(value = "/users/{id}")
    public ResponseEntity<?> getUserById(@PathVariable int id) {
        UserDTO users = userService.getUserById(id);
        return ResponseEntity.ok(users);
    }
    @GetMapping(value = "users/search")
    public ResponseEntity<?> searchUsers(@RequestParam(value = "name") String name){
        List<UserDTO> users = userService.searchUsers(name);
        return ResponseEntity.ok(users);
    }

}
