package com.example.demopojo.models;

public class User {

    private Integer id;
    private String name;
    private String gender;

    public User() {}

    public User(Integer id, String name, String gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
