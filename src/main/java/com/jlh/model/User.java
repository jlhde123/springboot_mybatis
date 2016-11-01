package com.jlh.model;

/**
 * Created by jlh
 * On 2016/10/17 0017.
 *
 * @description
 */
public class User {
    private Long id;
    private String name;
    private String password;
    private Integer age;
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
