package com.evan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 * @ClassName PersonService
 * @Description
 * @Author EvanWang
 * @Version 1.0.0
 * @Date 2019/12/22 17:26
 */
@Component
public class PersonService {

    @Autowired
    //@Lazy 标记在注入的bean上表明，当前被注入的bean被引用时，才加载。
    @Lazy
    EvanService evanService;

    public PersonService() {
        System.out.println("This is PersonService:Not Lazy");
    }

    public void lazyTest() {
        evanService.EvanServiceTest();
    }
}
