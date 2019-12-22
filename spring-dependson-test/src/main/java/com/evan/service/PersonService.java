package com.evan.service;

import org.springframework.stereotype.Component;

/**
 * @ClassName PersonService
 * @Description
 * @Author EvanWang
 * @Version 1.0.0
 * @Date 2019/12/22 18:02
 */
@Component
//@DependsOn("evanService")
public class PersonService {

    public PersonService() {
        System.out.println("PersonService");
    }

    public void test() {
    }
}
