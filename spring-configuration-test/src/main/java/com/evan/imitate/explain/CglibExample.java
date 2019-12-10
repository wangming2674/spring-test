package com.evan.imitate.explain;

import com.evan.imitate.service.Car;
import org.springframework.cglib.proxy.MethodInterceptor;

public class CglibExample extends Car {
   //set.callback
    MethodInterceptor methodInterceptor;

    public CglibExample(MethodInterceptor methodInterceptor) {
        this.methodInterceptor = methodInterceptor;
    }

    @Override
    public void driveCar() {
        //methodInterceptor.intercept(xxx);
        super.driveCar();
    }
}
