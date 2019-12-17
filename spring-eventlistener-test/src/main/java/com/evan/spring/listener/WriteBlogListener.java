package com.evan.spring.listener;

import com.evan.spring.event.WriteBlogEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @ClassName WriteBlogListener
 * @Description
 * @Author EvanWang
 * @Version 1.0.0
 * @Date 2019/12/10 15:47
 */
@Component
public class WriteBlogListener implements ApplicationListener<WriteBlogEvent> {
    @Override
    public void onApplicationEvent(WriteBlogEvent writeBlogEvent) {
        String name = writeBlogEvent.getName();
        String address = writeBlogEvent.getAddress();
        System.out.println("基于实现接口：" + name + "在" + address + "写了一篇博客");
    }
}
