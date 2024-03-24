package com.bjpn.bean;

import java.util.Objects;

public class Teacher {
    private Integer sAge;
    private Integer sId;
    private String sName;

    public Integer getsAge() {
        return sAge;
    }

    public void setsAge(Integer sAge) {
        this.sAge = sAge;
    }

    public Integer getsId() {
        return sId;
    }

    public void setsId(Integer sId) {
        this.sId = sId;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    //构造函数

    public Teacher(Integer sAge, Integer sId, String sName) {
        this.sAge = sAge;
        this.sId = sId;
        this.sName = sName;
    }

    public Teacher() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Teacher teacher = (Teacher) o;
        return Objects.equals(sAge, teacher.sAge) &&
                Objects.equals(sId, teacher.sId) &&
                Objects.equals(sName, teacher.sName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sAge, sId, sName);
    }
}
