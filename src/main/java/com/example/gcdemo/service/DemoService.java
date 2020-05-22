package com.example.gcdemo.service;

import com.example.gcdemo.service.dto.DemoDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.security.SecureRandom;

/**
 * TODO
 *
 * @author karl.xiong
 * @date 2020/4/26
 */
@Slf4j
@Service
public class DemoService {

    private SecureRandom random = new SecureRandom();

    public void bizHandle() {
        DemoDTO demoDTO = new DemoDTO();

        byte[] data = new byte[3072000];
        random.nextBytes(data);
        demoDTO.setData(data);

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        demoDTO.setMillis(System.currentTimeMillis());
    }
}
