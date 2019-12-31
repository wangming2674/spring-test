package com.evan.test;

import com.evan.config.AppConfig;
import com.evan.service.EvanService;
import com.evan.service.PersonService;
import com.evan.service.TomService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName RegisterSingletonTest
 * @Description
 * @Author EvanWang
 * @Version 1.0.0
 * @Date 2019/12/31 17:31
 */
public class RegisterSingletonTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
        ac.getBeanFactory().registerSingleton("tomService",new TomService());
        EvanService evanService = new EvanService();
        ac.getBeanFactory().registerSingleton("evanService",evanService);
        //将扫描到的类注册到spring容器
        ac.register(AppConfig.class);
        //刷新容器，完成bean的实例化
        ac.refresh();
        ac.getBean(PersonService.class).showEvanServiceResult();
    }
}
