package com.example.demo;

import java.util.Map;

public class ProductControllerV1 implements ControllerV1 {
    @Override
    public ModelView process(Map<String, String> paramMap) {
        return new ModelView("product");
    }
}