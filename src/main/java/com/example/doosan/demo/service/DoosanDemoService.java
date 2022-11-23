package com.example.doosan.demo.service;

import com.example.doosan.demo.dao.IDoosanDemoMapper;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class DoosanDemoService {
    @Autowired
    @Resource(name = "doosanSession")
    private SqlSessionTemplate sqlSession;

    public List<Map<String, Object>> getDevices() {

        IDoosanDemoMapper dao = sqlSession.getMapper(IDoosanDemoMapper.class);

        List<Map<String, Object>> devices = dao.getDevices();

        List<Map<String, Object>> mockDevices = new ArrayList<>();
        Map<String, Object> device = new HashMap<>();
        device.put("status", "");
        device.put("devId", "D112002");
        device.put("rcvDt", "20171016113822");
        device.put("devType", "SKY Crane1");
        device.put("devNo", "경남9바138");
        device.put("weight", "3.5 Ton");
        device.put("rcvDate", "20171016");
        device.put("rcvTime", "113822");
        device.put("lat", 35.201679);
        device.put("lng", 128.599182);
        device.put("rebound", 0);
        device.put("sate", 0);
        device.put("exactRate", 0);
        mockDevices.add(device);

        device = new HashMap<>();
        device.put("status", "");
        device.put("devId", "D112002");
        device.put("rcvDt", "20171017101003");
        device.put("devType", "SKY Crane1");
        device.put("devNo", "경남9바138");
        device.put("weight", "3.5 Ton");
        device.put("rcvDate", "20171017");
        device.put("rcvTime", "101003");
        device.put("lat", 35.200815);
        device.put("lng", 128.602222);
        device.put("rebound", 0);
        device.put("sate", 0);
        device.put("exactRate", 0);
        mockDevices.add(device);

        device = new HashMap<>();
        device.put("status", "");
        device.put("devId", "D112002");
        device.put("rcvDt", "20171019112948");
        device.put("devType", "SKY Crane1");
        device.put("devNo", "경남9바138");
        device.put("weight", "3.5 Ton");
        device.put("rcvDate", "20171019");
        device.put("rcvTime", "112948");
        device.put("lat", 35.201451);
        device.put("lng", 128.601114);
        device.put("rebound", 0);
        device.put("sate", 0);
        device.put("exactRate", 0);
        mockDevices.add(device);

        device = new HashMap<>();
        device.put("status", "");
        device.put("devId", "D112002");
        device.put("rcvDt", "20171019153407");
        device.put("devType", "SKY Crane1");
        device.put("devNo", "경남9바138");
        device.put("weight", "3.5 Ton");
        device.put("rcvDate", "20171019");
        device.put("rcvTime", "153407");
        device.put("lat", 35.200057);
        device.put("lng", 128.601551);
        device.put("rebound", 0);
        device.put("sate", 0);
        device.put("exactRate", 0);
        mockDevices.add(device);

        device = new HashMap<>();
        device.put("status", "");
        device.put("devId", "D112003");
        device.put("rcvDt", "20171014111056");
        device.put("devType", "SKY Crane1");
        device.put("devNo", "경남9바138");
        device.put("weight", "3.5 Ton");
        device.put("rcvDate", "20171014");
        device.put("rcvTime", "111056");
        device.put("lat", 35.199741);
        device.put("lng", 128.598944);
        device.put("rebound", 0);
        device.put("sate", 0);
        device.put("exactRate", 0);
        mockDevices.add(device);

        device = new HashMap<>();
        device.put("status", "");
        device.put("devId", "D112003");
        device.put("rcvDt", "20171014132950");
        device.put("devType", "SKY Crane1");
        device.put("devNo", "경남9바138");
        device.put("weight", "3.5 Ton");
        device.put("rcvDate", "20171014");
        device.put("rcvTime", "132950");
        device.put("lat", 35.201852);
        device.put("lng", 128.599511);
        device.put("rebound", 0);
        device.put("sate", 0);
        device.put("exactRate", 0);
        mockDevices.add(device);

        device = new HashMap<>();
        device.put("status", "");
        device.put("devId", "D112003");
        device.put("rcvDt", "20171016092046");
        device.put("devType", "SKY Crane1");
        device.put("devNo", "경남9바138");
        device.put("weight", "3.5 Ton");
        device.put("rcvDate", "20171016");
        device.put("rcvTime", "092046");
        device.put("lat", 35.199682);
        device.put("lng", 128.599011);
        device.put("rebound", 0);
        device.put("sate", 0);
        device.put("exactRate", 0);
        mockDevices.add(device);

        device = new HashMap<>();
        device.put("status", "");
        device.put("devId", "D112003");
        device.put("rcvDt", "20171019131036");
        device.put("devType", "SKY Crane1");
        device.put("devNo", "경남9바138");
        device.put("weight", "3.5 Ton");
        device.put("rcvDate", "20171019");
        device.put("rcvTime", "131036");
        device.put("lat", 35.202257);
        device.put("lng", 128.600892);
        device.put("rebound", 0);
        device.put("sate", 0);
        device.put("exactRate", 0);
        mockDevices.add(device);

        if (!devices.isEmpty()) {
            for (Map<String, Object> deviceRow : mockDevices) {
                for (Map<String, Object> deviceDataRow : devices) {
                    String imageName = String.format("%s_%s", deviceRow.get("devId"), deviceRow.get("rcvDt"));

                    if (imageName.equals(deviceDataRow.get("fileId"))) {
                        deviceRow.put("exactRate", deviceDataRow.get("resv4"));
                        if (deviceDataRow.get("resv4") != null) {
                            Integer resv4 = Integer.parseInt((String) deviceDataRow.get("resv4"));
                            if (resv4.intValue() > 50) {
                                deviceRow.put("status", "RUN");
                            } else {
                                deviceRow.put("status", "WAIT");
                            }
                        }
                    }
                }
            }
        }

        return mockDevices;
    }

    public List<Map<String, Object>> getCodes() {

        IDoosanDemoMapper dao = sqlSession.getMapper(IDoosanDemoMapper.class);

        List<Map<String, Object>> codes = dao.getCodes();

        return codes;
    }

    public List<Map<String, Object>> getCodeParam(String param) {

        IDoosanDemoMapper dao = sqlSession.getMapper(IDoosanDemoMapper.class);

        List<Map<String, Object>> codes = dao.getCodeParam(param);

        return codes;
    }


    public List<Map<String, Object>> getCodes2() {

        IDoosanDemoMapper dao = sqlSession.getMapper(IDoosanDemoMapper.class);

        List<Map<String, Object>> codes = dao.getCodes2();

        return codes;
    }
}