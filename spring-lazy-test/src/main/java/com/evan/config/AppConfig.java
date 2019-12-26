package com.evan.config;

import org.springframework.context.annotation.ComponentScan;

/**
 * @ClassName AppConfig
 * @Description
 * @Author EvanWang
 * @Version 1.0.0
 * @Date 2019/12/22 17:25
 */
@ComponentScan("com")
/**
 * 当
 * @Lazy
 * @Configuration  两个注解一起使用时，表明配置类中的所有通过@Bean标记的方法来注入的bean，全部实现懒加载
 */
public class AppConfig {
}
