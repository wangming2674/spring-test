package com.evan.imitate.config;

import com.evan.imitate.service.EvanService;
import com.evan.imitate.service.PersonService;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

//使用ImportSelector导入，相当于@Bean
public class MyImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        //返回String数组。
        return new String[]{EvanService.class.getName(), PersonService.class.getName()};
    }
}
