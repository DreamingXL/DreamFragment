package com.example.demo.entity;

public class User {
    private Integer id;
    private String name;
    private Integer sex;
    private String post;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    @Override
    public String toString(){
        return "User{" +
                "ID=" + id +
                ", 姓名='" + name + '\'' +
                ", 年龄='" + sex + '\'' +
                ", 岗位='" + post + '\'' +
                '}';
    }
}
