package com.daiju;

import com.daiju.pojo.AttributeInjection;
import com.daiju.pojo.Student;
import com.daiju.pojo.User;
import com.daiju.pojo.UserWithProcessor;
import org.junit.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.StringUtils;

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
}
