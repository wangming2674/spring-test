package com.evan.imitate.listener;

import com.evan.imitate.event.ApplicationEvent;

/**
 * @ClassName ApplicationListener
 * @Description
 * @Author EvanWang
 * @Version 1.0.0
 * @Date 2019/12/9 20:29
 */
public interface ApplicationListener<E extends ApplicationEvent> {
    void onEvent(E e);
}
