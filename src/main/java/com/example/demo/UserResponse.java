package com.example.demo;

public class UserResponse {
    private int id;
    private  String name;

    public UserResponse(int id, String name) {
        this.id = id;
        this.name = name;
    }

    //Code > Generate Get Set
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
