package com.example.doosan.demo.controller;

import com.example.doosan.demo.service.DoosanDemoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Slf4j
@RestController
@RequestMapping(value = "/api/check")
public class ServiceCheckController {

    @Autowired
    private DoosanDemoService codeService;

    @GetMapping("/readiness")
    public Map<String, String> getCodes(HttpServletResponse response) throws Exception {
        log.debug("[BEGIN] Readiness");

        Map<String, String> resultMap = new HashMap<>();
        int resultCnt = 0, errorCnt = 0;
        String errMsg = "";

        try {
            List<Map<String, Object>> result = codeService.getCodes();

            if (result == null) {
                errMsg += "API Database Server Check Fail, ";
                errorCnt += 1;
            } else {
                errMsg += "API Database Server Check OK, ";
            }

        } catch (Exception e) {
            throw new Exception("Readiness error! : " + e.getMessage());
        } finally {
            resultMap.put("resultMsg", errMsg);
            if (errorCnt > 0) {
                throw new Exception("Readiness error! : " + errMsg);
            } else {
                response.setStatus(HttpServletResponse.SC_OK);
            }
            log.debug("[END  ] Readiness");
        }
        return resultMap;

    }

    @GetMapping("/liveness")
    public Map<String, String> liveness() throws Exception {

        log.debug("[BEGIN] Liveness");

        Map<String, String> resultMap = new HashMap<>();
        resultMap.put("resultMsg", "OK");

        log.debug("[END  ] Liveness");

        return resultMap;
    }
}
