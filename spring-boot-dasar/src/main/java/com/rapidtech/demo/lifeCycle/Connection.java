package com.rapidtech.demo.lifeCycle;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

@Slf4j
public class Connection implements InitializingBean, DisposableBean {

    @Override
    public void destroy() throws Exception {
        log.debug("Connection is closed");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        log.debug("Connection is ready to used");
    }
}
