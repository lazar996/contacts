package com.book.contacts.model;

public class ChangePasswordData {

    private String oldPassword;
    private String newPassword;

    public ChangePasswordData(){}

    public String getOldPassword() {
        return oldPassword;
    }

    public void setOldPassword(String oldPassword) {
        this.oldPassword = oldPassword;
    }

    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }
}