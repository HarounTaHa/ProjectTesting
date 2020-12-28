package com.example.projecttestingforsmartdevice.models;

public class User {
        String userEmail;
        String userName;
        String userAddress;
        String password;
        String gender;
        public User() {
        }

    public User(String userEmail, String userName,String password) {
                this.userEmail = userEmail;
                this.userName = userName;
                this.password=password;
        }

    public User(String userEmail, String userName, String userAddress,String gender) {
        this.userEmail = userEmail;
        this.userName = userName;
        this.userAddress = userAddress;
        this.gender=gender;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
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
