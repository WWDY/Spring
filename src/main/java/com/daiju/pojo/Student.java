package com.daiju.pojo;

/**
 * @Author WDY
 * @Date 2020-11-07 16:56
 * @Description TODO
 */
public class Student {
    private String sName;
    private int sAge;

    public Student() {
//        System.out.println("我是Student类");
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public int getsAge() {
        return sAge;
    }

    public void setsAge(int sAge) {
        this.sAge = sAge;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sName='" + sName + '\'' +
                ", sAge=" + sAge +
                '}';
    }
}
