package com.book.contacts.model;

import javax.persistence.Column;
import javax.persistence.Entity;
@Entity(name="ContactsList")
public class ContactsListModel extends  UserModel{

    @Column(unique = true)
    private Integer contactId;

    @Column
    private String phone;

    @Column(nullable = false)
    private String address;

    @Column
    private String email;

    public ContactsListModel() {
    }


    public ContactsListModel(Long user_id, String typeUser, String username, String password, String firstName, String lastName, Integer contactId, String phone, String address, String email) {
        super(user_id, typeUser, username, password, firstName, lastName);
        this.contactId = contactId;
        this.phone = phone;
        this.address = address;
        this.email = email;
    }

    public Integer getContactId() {
        return contactId;
    }

    public void setContactId(Integer contactId) {
        this.contactId = contactId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "ContactsListModel{" +
                "contactId=" + contactId +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
