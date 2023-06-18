package com.bjpn.bean;

public class User {
    private int uId;
    private String uName;
    private int uAge;

    public User(int uId, String uName, int uAge) {
        this.uId = uId;
        this.uName = uName;
        this.uAge = uAge;
    }

    public User() {
    }

    public int getuId() {
        return uId;
    }

    public void setuId(int uId) {
        this.uId = uId;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public int getuAge() {
        return uAge;
    }

    public void setuAge(int uAge) {
        this.uAge = uAge;
    }
}
