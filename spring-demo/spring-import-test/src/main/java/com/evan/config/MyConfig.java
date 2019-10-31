package com.evan.config;

import com.evan.service.JustinService;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({MyImportSelector.class,MyImportBeanDefinitionRegistrar.class,OtherConfig.class, JustinService.class})
public class MyConfig {

}
