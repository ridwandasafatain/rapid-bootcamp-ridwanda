package com.rapidtech.demo.config;

import com.rapidtech.demo.model.Foo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
public class BeanConfig {
    @Bean
    public Foo foo(){
        Foo foo = new Foo();
        log.info("Created bean foo...!");
        return foo;
    }
}
