package com.mikotokoruk.testget;

public class User {
    /*
    需求：
    1，main方法中定义一个集合，存入三个用户对象。
    用户属性为：id，username，password
    2，要求：定义一个方法，根据id查找对应的学生信息。
    如果存在，返回索引
    如果不存在，返回-1
     */
    private String id;
    private String username;
    private String password;

    public User() {
    }
    public User(String id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
/*
    public User(){

    }
    public User(String id,String username, String password){
        this.id = id;
        this.username = username;
        this.password = password;

    }

    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id = id;
    }
     */

}
