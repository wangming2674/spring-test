package com.evan.imitate.service;

import org.springframework.stereotype.Component;

/**
 * @ClassName EvanService
 * @Description
 * @Author EvanWang
 * @Version 1.0.0
 * @Date 2019/12/2 15:41
 */
@Component
public class EvanService {
    String address;

    public EvanService() {
    }

    public EvanService(String name) {
        System.out.println(name);
    }

    public EvanService(String name, int age) {
        System.out.println(name);
        System.out.println(age);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
