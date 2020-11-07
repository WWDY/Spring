package com.daiju.pojo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @Author WDY
 * @Date 2020-11-07 16:47
 * @Description TODO
 */
public class UserWithProcessor /*implements BeanPostProcessor */{
/**
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("初始化方法之前");
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("初始化方法之后");
        return bean;
    }
    */
}
