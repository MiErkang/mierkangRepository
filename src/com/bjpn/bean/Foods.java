package com.bjpn.bean;

import java.util.Objects;

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

    //重写equals和hashCode方法

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Foods foods = (Foods) o;
        return Objects.equals(fruit, foods.fruit) &&
                Objects.equals(root, foods.root);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fruit, root);
    }
}
