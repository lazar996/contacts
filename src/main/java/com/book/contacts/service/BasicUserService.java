package com.book.contacts.service;

import com.book.contacts.model.BasicUserModel;
import com.book.contacts.repository.BasicUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BasicUserService {

    @Autowired
    BasicUserRepo basicUserRepo;

    public List<BasicUserModel> getAll() {

        return basicUserRepo.findAll();
    }
}
