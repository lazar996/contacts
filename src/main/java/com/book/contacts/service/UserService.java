package com.book.contacts.service;

import com.book.contacts.model.UserModel;
import com.book.contacts.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepo userRepo;

    public List<UserModel> getALl() { return userRepo.findAll(); }

}
