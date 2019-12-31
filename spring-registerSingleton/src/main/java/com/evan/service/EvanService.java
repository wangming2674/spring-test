package com.evan.service;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @ClassName EvanService
 * @Description
 * @Author EvanWang
 * @Version 1.0.0
 * @Date 2019/12/31 17:26
 */
//你可以把EvanService当成是与第三方应用交互产生的对象。
public class EvanService {
    @Autowired
    TomService tomService;

    public TomService showTomServiceResult() {
        return tomService;
    }
}