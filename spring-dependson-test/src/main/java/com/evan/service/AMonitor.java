package com.evan.service;

import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

/**
 * @ClassName Monitor
 * @Description
 * @Author EvanWang
 * @Version 1.0.0
 * @Date 2019/12/24 20:41
 */
@Component
@DependsOn({"eventA","eventB"})
public class AMonitor {
    public AMonitor() {
        System.out.println("AMonitor:初始化");
    }
}
