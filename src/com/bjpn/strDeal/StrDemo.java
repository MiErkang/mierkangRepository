package com.bjpn.strDeal;

public class StrDemo {
    public static void main(String[] args) {
        String a = "a&s&d&123";
        String b = "qwe456";
        strTest(a);
        String[] str1 = {"a", "b", "c", "1", "2", "3"};
        strTest01(str1);
    }

    //字符串转数组
    public static void strTest(String s) {
        String[] strings = s.split("&");
        for (int i = 0; i < strings.length; i++) {
            System.out.println("strings = " + strings[i]);
        }
    }

    //数组转字符串
    public static void strTest01(String[] strings) {
        StringBuffer stringBuffer = new StringBuffer();
        for (String s :
                strings) {
            stringBuffer.append(s);
        }
        System.out.println("stringBuffer = " + stringBuffer.toString());
    }
}
