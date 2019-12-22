package com.evan.service;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 * @ClassName EvanService
 * @Description
 * @Author EvanWang
 * @Version 1.0.0
 * @Date 2019/12/22 17:25
 */


@Component
//@Lazy 标记在类上，表明当前bean被引用时候，才进行加载
@Lazy
public class EvanService {
    public EvanService() {
        System.out.println("This is EvanService:@Lazy");
    }

    public void EvanServiceTest() {
        System.out.println("EvanService:test method");
    }
}
