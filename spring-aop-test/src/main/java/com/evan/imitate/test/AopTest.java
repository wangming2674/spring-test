package com.evan.imitate.test;

import com.evan.imitate.config.MyConfig;
import com.evan.imitate.service.OrderService;
import com.evan.imitate.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AopTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(MyConfig.class);
		ac.getBean(UserService.class).testAop();
		ac.getBean(OrderService.class).testAop();
	}
}
