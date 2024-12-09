package com.example.demo;

import java.io.IOException;
import java.util.Map;

public interface ControllerV2 {
    String process(Map<String, String> paramMap, Map<String, Object> model) throws IOException;
}
