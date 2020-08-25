package com.book.contacts.repository;

import com.book.contacts.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepo extends JpaRepository<UserModel,Long> {

    public List<UserModel> findAll();
    public UserModel findByUsername(String username);
    public UserModel findByTypeUser(String typeUser);
}
