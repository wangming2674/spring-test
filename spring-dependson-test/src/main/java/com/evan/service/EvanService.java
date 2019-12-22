package com.evan.service;

import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

/**
 * @ClassName EvanService
 * @Description
 * @Author EvanWang
 * @Version 1.0.0
 * @Date 2019/12/22 17:59
 */
@Component
@DependsOn("tomService")
/**
 * 加之前EvanService最先实例化，加之后tomService最线
 */
public class EvanService {

    public EvanService() {
        System.out.println("EvanService");
    }
}
