package com.daiju;


import com.daiju.anno.IService;
import com.daiju.anno.impl.IServiceImpl;
import com.daiju.config.Config;
import com.daiju.pojo.AttributeInjection;
import com.daiju.pojo.Student;
import com.daiju.pojo.User;
import com.daiju.pojo.UserWithProcessor;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

/**
 * @Author WDY
 * @Date 2020-11-07 16:36
 * @Description TODO
 */
public class MainTest {
    ClassPathXmlApplicationContext context;
    @Before
    public void before(){
        context = new ClassPathXmlApplicationContext("classpath:application.xml");
    }

    /**
     * bean的生命周期，没有bean的后置处理器
     */
    @Test
    public void beanLifetime(){
        User user = context.getBean("user", User.class);
        System.out.println("第四步，得到对象："+user);
        //手动销毁bean
        context.close();
    }

    /**
     * bean的生命周期，有bean的后置处理器
     */
    @Test
    public void beanLiseWithProcessor(){
        UserWithProcessor userWithProcessor = context.getBean("userWithProcessor", UserWithProcessor.class);
        System.out.println("第四步，得到对象："+userWithProcessor);
        //手动销毁bean
        context.close();
    }

    /**
     * 工厂bean
     */
    @Test
    public void factoryBean(){
        Student student = context.getBean("user", Student.class);
        System.out.println(student);
    }
    /**
     * 属性注入
     */
    @Test
    public void attributeInjection(){
        AttributeInjection attributeInjection = context.getBean("attributeInjection", AttributeInjection.class);
        System.out.println("基本数组："+ Arrays.toString(attributeInjection.getArrays()));
        System.out.println("list集合："+attributeInjection.getLists());
        System.out.println("set集合："+attributeInjection.getSets());
        System.out.println("map集合："+attributeInjection.getMaps());
        System.out.println("Emplooy："+attributeInjection.getEmplooy());
        System.out.println("Student："+attributeInjection.getStudent());
    }

    /**
     * 注解开发
     */
    @Test
    public void annoTest(){
        com.daiju.pojo.anno.User user = context.getBean("user", com.daiju.pojo.anno.User.class);
        System.out.println(user);
    }

    /**
     * 完全注解开发
     */
    @Test
    public void allAnnoTest(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        com.daiju.pojo.anno.User user = context.getBean("user", com.daiju.pojo.anno.User.class);
        System.out.println(user);
        IService iServiceImpl = context.getBean("IServiceImpl", IServiceImpl.class);
        iServiceImpl.addStu();

    }
}
