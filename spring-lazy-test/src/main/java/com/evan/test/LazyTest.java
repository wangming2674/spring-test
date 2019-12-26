package com.evan.test;

import com.evan.config.AppConfig;
import com.evan.service.PersonService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName LazyTest
 * @Description
 * @Author EvanWang
 * @Version 1.0.0
 * @Date 2019/12/22 17:24
 */
public class LazyTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
        ac.getBean(PersonService.class).lazyTest();
    }
}
