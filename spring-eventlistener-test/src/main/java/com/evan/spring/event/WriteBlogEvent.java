package com.evan.spring.event;

import org.springframework.context.ApplicationContext;
import org.springframework.context.event.ApplicationContextEvent;

/**
 * @ClassName MyEvent
 * @Description
 * @Author EvanWang
 * @Version 1.0.0
 * @Date 2019/12/10 15:39
 */
public class WriteBlogEvent extends ApplicationContextEvent {
    String name;
    String address;

    public WriteBlogEvent(ApplicationContext source, String name, String address) {
        super(source);
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    //可能event里面还有些其他的方法 做其他的事

}
