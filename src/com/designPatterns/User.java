package com.designPatterns;

public class User {
    public String name;
    public User(String name){
        this.name=name;
    }
    public void getName(){
        System.out.println("My name is "+name);
    }
}
