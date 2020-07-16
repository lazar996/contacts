package com.book.contacts.model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity(name = "basicUser")
public class BasicUserModel extends  UserModel {

    @Column(name = "email")
    private String email;

    @Column(name = "number")
    private long number;

    public BasicUserModel(){


    }

    public BasicUserModel(String email, long number) {
        this.email = email;
        this.number = number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "BasicUserModel{" +
                "email='" + email + '\'' +
                ", number=" + number +
                '}';
    }
}
