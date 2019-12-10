package com.evan.imitate.config;

import com.evan.imitate.service.JayService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//直接导入配置类
@Configuration
public class OtherConfig {
    @Bean
    public JayService jay(){
        return new JayService();
    }
}
