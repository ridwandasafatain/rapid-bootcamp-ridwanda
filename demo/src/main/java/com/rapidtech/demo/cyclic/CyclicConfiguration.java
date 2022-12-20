package com.rapidtech.demo.cyclic;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CyclicConfiguration {
    @Bean
    public CyclicA cyclicA(CyclicB cyclicB){
        return new CyclicA(cyclicB);
    }

    @Bean
    public CyclicB cyclicB(CyclicC cylicC){
        return new CyclicB(cylicC);
    }

    @Bean
    public CyclicC cyclicB(CyclicA cylicA){
        return new CyclicC(cylicA);
//        return null;
    }
}
