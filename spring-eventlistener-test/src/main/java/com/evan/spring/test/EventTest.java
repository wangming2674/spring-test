package com.evan.spring.test;

import com.evan.spring.config.AppConfig;
import com.evan.spring.event.WriteBlogEvent;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName EventTest
 * @Description
 * @Author EvanWang
 * @Version 1.0.0
 * @Date 2019/12/10 15:56
 */
public class EventTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
        WriteBlogEvent writeBlogEvent = new WriteBlogEvent(ac, "Evan", "家里");
        ac.publishEvent(writeBlogEvent);
    }
}
