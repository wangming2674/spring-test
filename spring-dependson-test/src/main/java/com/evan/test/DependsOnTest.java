package com.evan.test;

import com.evan.config.AppConfig;
import com.evan.service.AMonitor;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName DependsOnTest
 * @Description
 * @Author EvanWang
 * @Version 1.0.0
 * @Date 2019/12/22 17:53
 */
public class DependsOnTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
        ac.getBean(AMonitor.class);
        ac.getBean(AMonitor.class);
    }
}
