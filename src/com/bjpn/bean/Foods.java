package com.bjpn.bean;

public class Foods {
    private String fruit;
    private String root;

    public Foods(String fruit, String root) {
        this.fruit = fruit;
        this.root = root;
    }

    public Foods() {
    }

    public String getFruit() {
        return fruit;
    }

    public void setFruit(String fruit) {
        this.fruit = fruit;
    }

    public String getRoot() {
        return root;
    }

    public void setRoot(String root) {
        this.root = root;
    }
}
