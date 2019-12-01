package com.evan.config;

import com.evan.service.E;
import com.evan.service.F;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * 在实例化bean的时候，加上@configuration后，spring会把当前实例化bean的方法存在一个set中，然后进行比较，如果实例
 * 化bean的方法是当前方法，则执行当前方法的子类（代理类），如果判断实例化bean的方法与不是当前执行的方法，则执行父类的逻辑去
 * 创建bean.即使用getBean();
 */
@Component("com.evan")
@MapperScan
public class MyConfig {
    @Bean
    public E e() {
        System.out.println("init E");
        return new E();
    }

    @Bean
    public F f() {
        e();
        System.out.println("init F");
        return new F();
    }
}
