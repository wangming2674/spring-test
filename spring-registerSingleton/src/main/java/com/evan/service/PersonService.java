package com.evan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @ClassName PersonService
 * @Description
 * @Author EvanWang
 * @Version 1.0.0
 * @Date 2019/12/31 17:26
 */
@Component
public class PersonService {
    @Autowired
    EvanService evanService;

    public void showEvanServiceResult() {
        System.out.println(evanService);
        System.out.println(evanService.showTomServiceResult());
    }
}