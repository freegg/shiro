package com.pack.bean;

public class User {
    private Integer id;

    private String name;

    private String password;

    private Integer age;

    private Integer roleid;


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", roleid=" + roleid +
                '}';
    }

    public User() {
    }


    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public Integer getAge() {
        return age;
    }

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAge(Integer age) {
        this.age = age;
    }


    public User(Integer id, String name, String password, Integer age, Integer roleid) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.age = age;
        this.roleid = roleid;
    }
}