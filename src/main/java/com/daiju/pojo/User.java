package com.daiju.pojo;

import org.springframework.beans.factory.FactoryBean;

/**
 * @Author WDY
 * @Date 2020-11-07 16:32
 * @Description TODO
 */
public class User implements FactoryBean<Student> {
    private String name;
    private int age;

    public User() {
        System.out.println("第一步，通过构造方法实例化");
    }

    public void setName(String name) {
        System.out.println("第二步，通过set方法设置属性");
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void initMethod(){
        System.out.println("第三步，执行初始化方法");
    }
    public void destMethod(){
        System.out.println("第五步，执行销毁方法");
    }

    @Override
    public Student getObject() throws Exception {
        return new Student();
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
