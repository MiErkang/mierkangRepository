package com.bjpn.common;

import java.util.HashMap;
import java.util.Map;

public class Result {
    //成功
    public static Map<String, Object> success(){
        Map<String, Object> map = new HashMap<>();
        map.put("code", 1);
        map.put("message", "");
        map.put("success", true);
        return map;
    }

    public static Map<String, Object> success( String message){
        Map<String, Object> map = new HashMap<>();
        map.put("code", 1);
        map.put("message", message);
        map.put("success", true);
        return map;
    }

    //失败
    public static Map<String, Object> error(){
        Map<String, Object> map = new HashMap<>();
        map.put("code", 0);
        map.put("message", "");
        map.put("failure", false);
        return map;
    }

    public static Map<String, Object> error(String message){
        Map<String, Object> map = new HashMap<>();
        map.put("code", 0);
        map.put("message", message);
        map.put("failure", false);
        return map;
    }

    //后台随机生成验证码
    public static String messageCode(int len) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < len; i++) {
            stringBuilder.append(Math.round(Math.random() * 9));//Math.random（）返回的是<1的数
        }
        return stringBuilder.toString();
    }
}
