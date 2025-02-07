package com.LibraryApp.services;

import com.LibraryApp.entities.Users;
import com.LibraryApp.repositries.UsersRepository;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpI implements UserService {

    @Autowired
    private UsersRepository usersRepository;
    @Override
    public List<Users> getAllUsers() {
        return List.of();
    }

    @Override
    public Users getUsersById(long id) {
        Optional<Users> optionalUsers;
        optionalUsers = usersRepository.findById(id);


        return null;
    }

    @Override
    public Users createUsers(long id, User User) {
        return null;
    }

    @Override
    public void deleteUser(long id) {

    }

    @Override
    public Users createUsers(Users users) {
        return null;
    }
}
