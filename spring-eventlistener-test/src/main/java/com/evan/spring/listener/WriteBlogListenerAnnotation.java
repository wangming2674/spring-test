package com.evan.spring.listener;

import com.evan.spring.event.WriteBlogEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * @ClassName WriteBlogListenerAnnotation
 * @Description
 * @Author EvanWang
 * @Version 1.0.0
 * @Date 2019/12/10 16:30
 */
@Component
public class WriteBlogListenerAnnotation {
    @EventListener
    public void annotationListen(WriteBlogEvent writeBlogEvent) {
        String name = writeBlogEvent.getName();
        String address = writeBlogEvent.getAddress();
        System.out.println("基于注解：" + name + "在" + address + "写了一篇博客");
    }
}
