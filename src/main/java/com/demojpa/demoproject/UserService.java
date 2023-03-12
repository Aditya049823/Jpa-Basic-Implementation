package com.demojpa.demoproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;


    public String addUser(User user) {
        userRepository.save(user);
        return "User added";
    }

    public List<User> getUser() {
        return userRepository.findAll();
    }

    public Optional<User> getbyId(int id) {
        return userRepository.findById(id);
    }

    public String deletebyId(int id) {
        userRepository.deleteById(id);
        return "Deleted Sucessfully";
    }

    public String deleteAll() {
        userRepository.deleteAll();
        return "All records deleted";
    }
}
