package com.book.contacts.controller;

import com.book.contacts.model.BasicUserModel;
import com.book.contacts.service.BasicUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BasicUserController {

    @Autowired
    BasicUserService basicUserService;

    @GetMapping("api/basicUser")
    public ResponseEntity<?> getAll(){

        return new ResponseEntity<List<BasicUserModel>>(this.basicUserService.getAll(), HttpStatus.OK);
    }

}
