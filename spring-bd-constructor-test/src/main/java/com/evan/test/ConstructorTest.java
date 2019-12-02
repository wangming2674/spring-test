package com.evan.test;

import com.evan.config.AppConfig;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.PropertyValue;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName ConstructorTest
 * @Description
 * @Author EvanWang
 * @Version 1.0.0
 * @Date 2019/12/2 15:44
 */
public class ConstructorTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac=new AnnotationConfigApplicationContext();
        ac.register(AppConfig.class);
        ac.refresh();
        BeanDefinition evanService = ac.getBeanDefinition("evanService");
        MutablePropertyValues propertyValues = evanService.getPropertyValues();
        for (PropertyValue propertyValue : propertyValues) {
            System.out.println(propertyValue.getValue());
        }
        System.out.println(evanService);

    }
}
