package com.rapidtech.demo.config;

import com.rapidtech.demo.model.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class DependencyInjectionTest {
    private static ApplicationContext context;
    @BeforeEach
    void setUp() {
        context = new AnnotationConfigApplicationContext(DependencyInjection.class);
    }

    @Test
    void dependencyTest() {
        Foo foo = context.getBean("fooSecond",Foo.class);
        Bar bar = context.getBean(Bar.class);
        FooBar fooBar = context.getBean(FooBar.class);

        Product product = context.getBean(Product.class);
        Category category = context.getBean(Category.class);
        ProductCategory productCategory = context.getBean(ProductCategory.class);

        Assertions.assertSame(foo, fooBar.getFoo());
        Assertions.assertSame(bar, fooBar.getBar());

        Assertions.assertSame(product, productCategory.getProduct());
        Assertions.assertSame(category, productCategory.getCategory());
    }

}