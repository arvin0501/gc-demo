package com.example.gcdemo.service;

import com.example.gcdemo.service.dto.DemoDTO;

import java.util.ArrayList;
import java.util.List;

/**
 * TODO
 *
 * @author karl.xiong
 * @date 2020/4/26
 */
public class DemoService {



    public void bizHandle() {
        List<DemoDTO>  list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            DemoDTO demoDTO = new DemoDTO();
            byte[] data = new byte[102400];
            demoDTO.setData(data);
            list.add(demoDTO);
        }
    }
}
