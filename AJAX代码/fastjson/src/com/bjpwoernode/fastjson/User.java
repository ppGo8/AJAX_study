package com.bjpwoernode.fastjson;

/**
 * @时间: 2023-05-14
 * @作者： ppgo8
 * @描述：
 **/
public class User {
    private String id;
    private String username;
    private int age;

    // alt+insert 快速添加构造函数
    public User(String id, String username, int age) {
        this.id = id;
        this.username = username;
        this.age = age;
    }

    public String getId(){
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
