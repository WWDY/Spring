package com.daiju;

import com.daiju.anno.IService;
import com.daiju.aspect.UserService;
import com.daiju.aspect.UserService1;
import com.daiju.pojo.Student;
import com.daiju.pojo.anno.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @Author WDY
 * @Date 2020-11-10 22:55
 * @Description TODO
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:application.xml"})
public class SpringJUnit {
    @Autowired
    User user;

    @Resource
    IService iService;

    @Autowired
    @Qualifier("student")
    Student student;

    @Resource
    UserService userService;

    @Test
    public void test(){
        System.out.println(user);
    }
    @Test
    public void test01() {
        iService.addStu();
        System.out.println(student);
    }

    @Test
    public void aspectWithAnno(){
        userService.add();
    }
    @Test
    public void aspectWithXml(){
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:application1.xml");
        UserService1 userService1 = context.getBean("userService1", UserService1.class);
        userService1.add();
    }
}
