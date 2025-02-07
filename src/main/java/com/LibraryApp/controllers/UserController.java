package com.LibraryApp.controllers;

import com.LibraryApp.dto.UserDto;
import com.LibraryApp.entities.Users;
import com.LibraryApp.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class UserController {

    @Autowired
    private UserService userService;
    private Users Users;

    @GetMapping("/create")
    public ResponseEntity<Users> createUser(@RequestBody UserDto userDto){
        Users newUser = new Users();
        newUser.setUserName(userDto.getName());
    return new ResponseEntity<>(userService.createUsers(newUser), HttpStatus.CREATED);
    }

}
