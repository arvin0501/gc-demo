package com.example.gcdemo.service.impl;

import com.example.gcdemo.service.Demo2Service;
import com.example.gcdemo.service.dto.DemoDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class Demo2ServiceImpl implements Demo2Service {

    @Override
    public void bizHandle() {
        DemoDTO demoDTO = new DemoDTO();
        byte[] data = new byte[512000];
        demoDTO.setData(data);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        log.info("11");
    }
}
