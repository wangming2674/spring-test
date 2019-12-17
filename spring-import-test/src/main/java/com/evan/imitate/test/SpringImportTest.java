package com.evan.imitate.test;

import com.evan.imitate.config.MyConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringImportTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
        ac.register(MyConfig.class);
        ac.refresh();
        String[] beanDefinitionNames = ac.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
    }
}
