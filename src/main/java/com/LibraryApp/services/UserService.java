package com.LibraryApp.services;

import com.LibraryApp.entities.Users;
import org.apache.catalina.User;

import java.util.List;

public interface UserService {

    List<Users> getAllUsers();
    Users getUsersById(long id);
    Users createUsers(long id, User User);
    void deleteUser(long id);


    Users createUsers(Users users);
}
