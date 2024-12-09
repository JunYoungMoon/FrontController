package com.example.demo;

import java.util.Map;

public class UserControllerV2 implements ControllerV2 {
    @Override
    public String process(Map<String, String> paramMap, Map<String, Object> model) {
        String name = paramMap.get("name");
        int age = Integer.parseInt(paramMap.get("age"));

        Member member = new Member(name, age);
        model.put("member", member);

        return "user";
    }
}