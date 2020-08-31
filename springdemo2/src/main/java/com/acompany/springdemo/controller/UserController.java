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
        System.out.println("컨트롤러::");
        return userService.getUsers();
    }

    @GetMapping("/{userid}")
    public User getUserByUserid(@PathVariable Integer userid){

        System.out.println(userid);
        return userService.getUserByID(userid);
    }
    //등록
    @PostMapping("")
    public User registUser(@RequestBody User user){
        //데이터 확보해서 서비스로 넘겨주는 것까지의 컨트롤러 역할
        System.out.println(user);
        return userService.registUser(user);
    }
    //수정 - 수정에 대한 id도 전달
    @PutMapping("/{userid}")
    public void modifyUser(
            @PathVariable Integer userid,
            @RequestBody User user){
        userService.modifyUser(userid, user);
    }
    //삭제 -
    @DeleteMapping("/{userid}")
    public void removeUser(@PathVariable Integer userid){
        userService.removeUser(userid);
    }

//    //사용자 불러오기
//    @GetMapping("/{userid}")
//    public User getUset(@PathVariable("userid") Integer userid){
//        return userService.getUser(userid);
//    }
//
//    //사용자 생성??
//    @PostMapping("")
//    public Map<String, Object> createUser(
//            @RequestParam(value="userid") Integer userid,
//            @RequestParam(value="username") String username) {
//        Map<String, Object> map = new HashMap<String, Object>();
//        userService.createUser(userid, username);
//        map.put("result", "added");
//        return map;
//    }
//
//    //update
//    @PutMapping("")
//    public Map<String, Object> updateUser(
//            @RequestParam(value="userid") Integer userid,
//            @RequestParam(value="username") String username) {
//        Map<String, Object> map = new HashMap<String, Object>();
//        userService.updateUser(userid, username);
//        map.put("result", "updated");
//        return map;
//    }
//
//    //delete
//    @DeleteMapping("/{userid}")
//    public Map<String, Object> deleteUser(
//            @PathVariable("userid") Integer userid) {
//        Map<String, Object> map = new LinkedHashMap<String, Object>();
//        userService.deleteUser(userid);
//        map.put("result", "deleted");
//        return map;
//
//    }

}
