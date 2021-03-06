package com.bfchengnuo.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by 冰封承諾Andy on 2017/6/28.
 * 简单的用户实体对象,此对象应该序列化，以便可以唯一的标识该对象，并且可以进行传输
 */
public class User implements Serializable {
    private Integer id;
    private String name;
    private String email;
    private Integer age;
    private Date hiredate;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getHiredate() {
        return hiredate;
    }

    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
    }
}
