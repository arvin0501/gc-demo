package com.example.gcdemo.service;

import com.example.gcdemo.service.dto.DemoDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * TODO
 *
 * @author karl.xiong
 * @date 2020/4/26
 */
@Slf4j
@Service
public class DemoService {

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