package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsersController {

    @GetMapping("/users")
    public PagingResponse getAllUser(
            @RequestParam(defaultValue = "1") int page,
            @RequestParam(name = "item_per_page" ,defaultValue = "10") int itemPerPage) {

        PagingResponse pagingResponse = new PagingResponse(page, itemPerPage);
        List<UsersResponse> usersResponseList = new ArrayList<>();
        usersResponseList.add(new UsersResponse(1, "User 1"));
        usersResponseList.add(new UsersResponse(2, "User 2"));
        usersResponseList.add(new UsersResponse(3, "User 3"));
        pagingResponse.setUsersResponse(usersResponseList);
        return pagingResponse;

    }

    @GetMapping("/users/{id}")
    public UsersResponse getUserById (@PathVariable(name = "id")int id){
        return  new UsersResponse(id, "User" + id);
    }
    //GET PAGE WORKSHOP Step_02
    //Ref. https://spring.io/guides/gs/rest-service/
    //private static final String template = "Hello, %s!";
    //private final AtomicLong counter = new AtomicLong();

    //@GetMapping("/user/{id}")
    //public String getAllUserAndPage(@PathVariable(name = "id")int id,
    //                                @RequestParam(required = false,defaultValue = "1") String page,
    //                                @RequestParam(name = "item_per_page",required = false,defaultValue = "10") String itemPerPage) {
    //    return (String.format(template, "User : " + id + "Page: " + page + " , itemPerPage: " + itemPerPage));
    //}
}
