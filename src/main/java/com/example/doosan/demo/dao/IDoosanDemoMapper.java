package com.example.doosan.demo.dao;

import java.util.List;
import java.util.Map;

public interface IDoosanDemoMapper {

    List<Map<String, Object>> getDevices();

    List<Map<String, Object>> getCodes();

    List<Map<String, Object>> getCodes2();

    List<Map<String, Object>> getCodeParam(String param);

}
