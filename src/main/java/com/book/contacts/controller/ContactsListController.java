package com.book.contacts.controller;

import com.book.contacts.model.ContactsListModel;
import com.book.contacts.service.ContactsListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ContactsListController {

    @Autowired
    ContactsListService contactsListService;


    @GetMapping("api/ContactsList")
    public ResponseEntity<?> getAll(){

            return  new ResponseEntity<List<ContactsListModel>>(this.contactsListService.getAll(),HttpStatus.OK);


}}
