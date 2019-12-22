package com.evan.spring.config;

import org.springframework.context.annotation.ComponentScan;

/**
 * @ClassName Appconfig
 * @Description
 * @Author EvanWang
 * @Version 1.0.0
 * @Date 2019/12/10 16:04
 */
@ComponentScan("com")
//@EnableAsync
public class AppConfig {

    //配置线程池 也可以采用@Async 让spring自动去用默认的配置线程池SimpleAsyncTaskExecutor
    //BeanName 必须是这个
//    @Bean("applicationEventMulticaster")
//    public SimpleApplicationEventMulticaster simpleApplicationEventMulticaster(BeanFactory beanFactory,ThreadPoolTaskExecutor poolTaskExecutor){
//        SimpleApplicationEventMulticaster simpleApplicationEventMulticaster
//                = new SimpleApplicationEventMulticaster(beanFactory);
//        simpleApplicationEventMulticaster.setTaskExecutor(poolTaskExecutor);
//        return simpleApplicationEventMulticaster;
//    }
//
//    @Bean
//    public ThreadPoolTaskExecutor poolTaskExecutor(){
//        ThreadPoolTaskExecutor threadPoolTaskExecutor = new ThreadPoolTaskExecutor();
//        threadPoolTaskExecutor.setMaxPoolSize(15);
//        threadPoolTaskExecutor.setCorePoolSize(10);
//        threadPoolTaskExecutor.setQueueCapacity(30);
//        threadPoolTaskExecutor.setRejectedExecutionHandler(new ThreadPoolExecutor.AbortPolicy());
//        threadPoolTaskExecutor.initialize();
//        return threadPoolTaskExecutor;
//
//    }
}
