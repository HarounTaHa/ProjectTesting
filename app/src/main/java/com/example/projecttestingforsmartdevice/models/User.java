package com.example.projecttestingforsmartdevice.models;

public class User {
        String userEmail;
        String userName;
        String userAddress;
        String password;
        public User() {
        }

    public User(String userEmail, String userName,String password, String userAddress) {
                this.userEmail = userEmail;
                this.userName = userName;
                this.password=password;
                this.userAddress = userAddress;
        }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }
}
