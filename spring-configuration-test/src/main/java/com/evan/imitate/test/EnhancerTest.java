package com.evan.imitate.test;

import com.evan.imitate.interceptor.MyMethodInterceptor;
import com.evan.imitate.service.Car;
import org.springframework.cglib.proxy.Enhancer;


public class EnhancerTest {
    public static void main(String[] args) {
        Enhancer enhancer=new Enhancer();
        //设置要通过enhancer创建的代理类的 父类 类型。
        enhancer.setSuperclass(Car.class);
        enhancer.setCallback(new MyMethodInterceptor());
        //通过enhancer去创建一个类，实际上我们是看不到的。
        Car car = (Car)enhancer.create();
        car.driveCar();
    }
}
