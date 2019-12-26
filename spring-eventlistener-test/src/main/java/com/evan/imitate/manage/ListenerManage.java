package com.evan.imitate.manage;

import com.evan.imitate.event.ApplicationEvent;
import com.evan.imitate.listener.ApplicationListener;

import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName ListenerManage
 * @Description
 * @Author EvanWang
 * @Version 1.0.0
 * @Date 2019/12/9 20:44
 */
//其实可以通过@Bean将我们自定义的监听器和监听器管理器加入到spring容器，实现全部自定义
//事件管理器
public class ListenerManage {

    //保存所有的监听器
    static List<ApplicationListener<ApplicationEvent>> list = new ArrayList<>();

    //添加监听器 注：如果要做的更加优雅，应该做成扫描全局，通过扫描将所有的监听器放入管理器的容器列表，这里为了方便演示就不做复杂了。
    //springboot是从spring的BeanFactory中获取listener
    //也可以自定义注解，来实现加载监听器的效果
    public static void addListener(ApplicationListener listener) {
        list.add(listener);
    }

    //判断一下 有哪些监听器 监听了这个事件
    public static void publishEvent(ApplicationEvent event) {
        for (ApplicationListener<ApplicationEvent> applicationListener : list) {
            //获取ApplicationListener的泛型
            Class typeParameter = (Class) ((ParameterizedType) applicationListener.getClass().getGenericInterfaces()[0]).getActualTypeArguments()[0];
            if (typeParameter.equals(event.getClass())) {
                applicationListener.onEvent(event);
            }
        }
    }
}
