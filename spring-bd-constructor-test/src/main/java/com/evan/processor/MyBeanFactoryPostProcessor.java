package com.evan.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

/**
 * @ClassName MyBeanFactoryPostProcessor
 * @Description
 * @Author EvanWang
 * @Version 1.0.0
 * @Date 2019/12/2 15:46
 */
@Component
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        BeanDefinition evBeanDefinition = beanFactory.getBeanDefinition("evanService");
        //给构造方法参数赋值，按顺序=>根据参数数量 去使用指定构造方法(推断构造方法)
        evBeanDefinition.getConstructorArgumentValues().addGenericArgumentValue("hello");
        //evBeanDefinition.getConstructorArgumentValues().addGenericArgumentValue("15");
        //给构造方法参数赋值，按索引
        evBeanDefinition.getConstructorArgumentValues().addIndexedArgumentValue(1,18);
        //给注入的bean中的属性，添加属性值
        evBeanDefinition.getPropertyValues().add("address", "china");
    }
}
