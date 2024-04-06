package com.bjpn.strDeal;

public class StrDemo {
    public static void main(String[] args) {
        String a = "a&s&d&123";
        String b = "qwe456";
        strTest(a);
    }

    //字符串转数组
    public static void strTest(String s) {
        String[] strings = s.split("&");
        for (int i = 0; i < strings.length; i++) {
            System.out.println("strings = " + strings[i]);
        }
    }
}
