package com.book.contacts.service;

import com.book.contacts.model.ContactsListModel;
import com.book.contacts.repository.ContactsListRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactsListService {

    @Autowired
    ContactsListRepo contactsListRepo;


    public List<ContactsListModel> getAll() {

        return contactsListRepo.findAll();}
    }

