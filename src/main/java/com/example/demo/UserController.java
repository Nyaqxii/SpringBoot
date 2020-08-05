package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.concurrent.atomic.AtomicLong;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    @GetMapping("/users")  //ไม่ค่อยใช้ ARRAY ใช้ List
    public List<UserResponse> getAllUser(){
        List<UserResponse> userResponsesList = new ArrayList<>();
        userResponsesList.add(new UserResponse(1, "User 1"));
        userResponsesList.add(new UserResponse(2, "User 2"));
        userResponsesList.add(new UserResponse(3, "User 3"));
        return  userResponsesList;

    }

    @GetMapping("/users/{id}")
    public  UserResponse getUserById (@PathVariable(name = "id")int id){
        return  new UserResponse(id, "User" + id);
    }
    //GET PAGE WORKSHOP Step_02
    //Ref. https://spring.io/guides/gs/rest-service/
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/user/{id}")
    public String getAllUserAndPage(@PathVariable(name = "id")int id,
                                    @RequestParam(required = false,defaultValue = "1") String page,
                                    @RequestParam(name = "item_per_page",required = false,defaultValue = "10") String itemPerPage) {
        return (String.format(template, "User : " + id + "Page: " + page + " , itemPerPage: " + itemPerPage));
    }
}
