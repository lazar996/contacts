package com.book.contacts.repository;

import com.book.contacts.model.ContactsListModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ContactsListRepo extends JpaRepository<ContactsListModel, Long> {

    public List<ContactsListModel>findAll();
}
