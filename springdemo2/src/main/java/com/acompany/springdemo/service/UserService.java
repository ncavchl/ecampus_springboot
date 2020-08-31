package com.acompany.springdemo.service;

import com.acompany.springdemo.model.User;

import java.util.List;
public interface UserService{
    List<User> getUsers();

    User getUserById(Integer userid);
    User registUser(User user);
    void modifyUser(Integer userid, User user);
    void removeUser(Integer userid);
}
import com.acompany.springdemo.dao.UserRepository;
import com.acompany.springdemo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
//
//@Service
//public class UserService {
////    User users = new User(,);
//
////    @Override
////    public void createUser (Integer userid, String username){
////        User user = new User(userid, username);
////        this.users.add(user);
////    }
////
////    @Override
////    public void updateUser (Integer userid, String username){
////        users.stream()
////            .filter(x -> x.getUserid() == userid)
////            .findAny()
////            .orElseThrow(() -> new RuntimeException("Item not found"))
////            .setUsername(username);
////    }
////
////    @Override
////    public void deleteUser(Integer userid){
////        users.removeIf((User u) -> u.getUserid() == userid);
////    }
////
////    @Override
////    public User getUser(Integer userid){
////        return user.stream()
////                .filter(x -> x.getUserid() == userid)
////                .findAny()
////                .orElse(new User(0, "Not Available"));
////    }
//
//    @Autowired
//    private UserRepository userRepository;
//
//    public Map<String, String> getMessage(){
//        Map<String, String> res = new HashMap<>();
//        res.put("greet", "Hello world");
//
//        return res;
//    }
//
//    public List<User> getUsers(){
//        System.out.println("서비스::");
//        return userRepository.getAllusers();
//    }
//
//    public User getUserByID(Integer userid){
//        return userRepository.getUserByUserID(userid);
//    }
//
//    public User registUser(User user) {
//        return userRepository.insertUser(user);
//    }
//
//    public void modifyUser(Integer userid, User user){
//        user.setUserid(userid);
//        userRepository.updateUser(user);
//    }
//
//    public void removeUser(Integer userid){
//        userRepository.deleteUser(userid);
//    }
//}
