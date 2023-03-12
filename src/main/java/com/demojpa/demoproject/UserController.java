package com.demojpa.demoproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/add")
    public String addUser(@RequestBody User user){
        return userService.addUser(user);
    }

    @GetMapping("/get_user")
    public List<User> getUser(){
        return userService.getUser();
    }

    @GetMapping("/get-by-id")
    public Optional<User> getbyId(@RequestParam("id") int id)
    {
        return userService.getbyId(id);
    }

    @DeleteMapping("/delete-by-id")
    public String deletebyId(@RequestParam("id") int id)
    {
        return userService.deletebyId(id);
    }

    @DeleteMapping("/deleteAll")
    public String deleteAll(){
        return userService.deleteAll();
    }
}
