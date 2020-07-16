package com.book.contacts.repository;

import com.book.contacts.model.BasicUserModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BasicUserRepo extends JpaRepository<BasicUserModel, Long> {

    public List<BasicUserModel> findAll();
}
