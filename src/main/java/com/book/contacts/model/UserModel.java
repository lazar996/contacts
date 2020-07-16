package com.book.contacts.model;

import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "user")
public class UserModel {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    @Column(name ="user_id", nullable = false, unique = true)
    private Long user_id;

    @Column(name = "type_user")
    private String typeUser;

    @Column(name = "username")
    private String username;

    @Column
    private  String password;


    @Column
    private String firstName;

    @Column
    private  String lastName;

    public UserModel( ){


    }

    public UserModel(Long user_id, String typeUser, String username, String password, String firstName, String lastName) {
        super();
        this.user_id = user_id;
        this.typeUser = typeUser;
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public UserModel(String typeUser){
        this.typeUser = typeUser;
    }


    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public String getTypeUser() {
        return typeUser;
    }

    public void setTypeUser(String typeUser) {
        this.typeUser = typeUser;
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

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "User{" +
                "user_id=" + user_id +
                ", typeUser='" + typeUser + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
