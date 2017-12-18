package com.nepxion.thunder.test;

/**
 * <p>Title: Nepxion Thunder</p>
 * <p>Description: Nepxion Thunder For Distribution</p>
 * <p>Copyright: Copyright (c) 2017</p>
 * <p>Company: Nepxion</p>
 * @author Haojun Ren
 * @email 1394997@qq.com
 * @version 1.0
 */

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nepxion.thunder.test.service.EchoClientPressureTest;

public abstract class HessianClientPressureTest extends EchoClientPressureTest {
    private final static ApplicationContext APPLICATION_CONTEXT = new ClassPathXmlApplicationContext("classpath*:hessian-client-context-pressure.xml");

    @Override
    protected ApplicationContext getApplicationContext() {
        return APPLICATION_CONTEXT;
    }
}