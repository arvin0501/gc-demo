package com.example.gcdemo.service.impl;

import com.example.gcdemo.service.Demo2Service;
import com.example.gcdemo.service.dto.DemoDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.security.SecureRandom;

@Slf4j
@Service
public class Demo2ServiceImpl implements Demo2Service {

    private SecureRandom random = new SecureRandom();

    @Override
    public void bizHandle2() {
        DemoDTO demoDTO = new DemoDTO();
        demoDTO.setMillis(System.currentTimeMillis());
        byte[] data = new byte[3072000];
        random.nextBytes(data);
        demoDTO.setData(data);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
