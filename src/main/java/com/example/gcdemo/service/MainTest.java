package com.example.gcdemo.service;

import com.example.gcdemo.service.dto.DemoDTO;

import java.util.ArrayList;
import java.util.List;

public class MainTest {

    public static void main(String[] args) throws InterruptedException {

        List<DemoDTO> list = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            DemoDTO demoDTO = new DemoDTO();
            byte[] data = new byte[2048000];
            demoDTO.setData(data);
            list.add(demoDTO);
            System.out.println(i);
            Thread.sleep(500);
        }
    }
}
