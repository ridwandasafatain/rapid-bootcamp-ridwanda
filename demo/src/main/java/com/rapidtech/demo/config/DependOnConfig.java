package com.rapidtech.demo.config;

import com.rapidtech.demo.model.Bar;
import com.rapidtech.demo.model.Foo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.*;

@Slf4j
@Configuration
public class DependOnConfig {
    @Lazy
    @Bean
    @DependsOn(value = {"foo"})
    public Bar bor(){
        log.debug("Creating new Bar");
        return new Bar();
    }

    @Bean
    @Scope("prototype")
    public Foo foo(){
        log.debug("Creating new Foo");
        return new Foo();
    }
}
