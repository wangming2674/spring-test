package com.evan.imitate.interceptor;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class MyMethodInterceptor implements MethodInterceptor {
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        //输出Object o的类类型.
        System.out.println(o.getClass());
        //得到调用方法名称.
        System.out.println(method.getName());
        //得到被代理类（父类）的方法的名称.
        System.out.println(methodProxy.getSuperName());
        System.out.println("汽车打火，开始启动...");
        Object returnValue = methodProxy.invokeSuper(o, null);
        System.out.println("汽车熄火，停车...");
        return returnValue;
    }
}
