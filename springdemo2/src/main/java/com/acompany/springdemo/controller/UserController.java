package com.acompany.springdemo.controller;

import com.acompany.springdemo.model.User;
import com.acompany.springdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/users")
public class UserController {
//사용자 요청을 위한 컨트롤러

    @Autowired
    private UserService userService;

    @GetMapping("")
    public List<User> getAllUsers(){
        return userService.getUsers();
    }

    @GetMapping("/userid")
    public User getUserByUserid(Integer userid){
        return userService.getUserByID(userid);
    }
    //등록
    @PostMapping("")
    public User registUser(){
        //데이터 확보해서 서비스로 넘겨주는 것까지의 컨트롤러 역할
        User user = todo;
        userService.registUser(user);
    }
    //수정 - 수정에 대한 id도 전달
    @PutMapping("/userid")
    public void modifyUser(String userid){
        User user = todo;
        userService.modifyUser(userid, user);
    }
    //삭제 -
    @DeleteMapping("/userid")
    public void removeUser(String userid){
        userService.removeUser(userid);
    }
}
