package com.qf.zhouhaifeng.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationContextUtil {

    private static ApplicationContext applicationContext;

    public static Object getBean(String beanName) {

        if (null == applicationContext) {

            applicationContext = new ClassPathXmlApplicationContext("spring-context.xml");
        }

        return applicationContext.getBean(beanName);

    }
}
