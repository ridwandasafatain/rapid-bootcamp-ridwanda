package com.rapidtech.demo.config;

import com.rapidtech.demo.model.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class DependencyInjection {
    @Primary
    @Bean(value = "fooFirst")
    public Foo foo1(){
        return new Foo();
    }

    @Bean(value = "fooSecond")
    public Foo foo2(){
        return new Foo();
    }

    @Bean
    public Bar bar(){
        return new Bar();
    }

    @Bean
    public FooBar fooBar(@Qualifier("fooSecond") Foo foo, Bar bar){
        return new FooBar(foo, bar());
    }

    @Bean
    public Product product(){
        return new Product();
    }

    @Bean
    public Category category(){
        return new Category();
    }

    @Bean
    public ProductCategory productCategory(Product product, Category category){
        return new ProductCategory(product(), category());
    }
}
