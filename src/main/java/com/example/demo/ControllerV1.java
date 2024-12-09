package com.example.demo;

import java.io.IOException;
import java.util.Map;

public interface ControllerV1 {
    ModelView process(Map<String, String> paramMap) throws IOException;
}
