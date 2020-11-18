package com.daiju;

import com.daiju.pojo.Emplooy;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author WDY
 * @Date 2020-11-17 10:32
 * @Description TODO
 */

@SpringJUnitConfig(locations = {"classpath:application3.xml"})
public class JdbcTemplateTest {

    @Autowired
    JdbcTemplate jdbcTemplate;

    /**
     * 插入
     */
    @Test
    public void addEmplooy(){
        String sql = "insert into emplooy (e_name,e_age) values (?,?)";
        Emplooy emplooy = new Emplooy();
        emplooy.setENamed("zhangsan");
        emplooy.setEAge(12);
        Object[] objs = {"zhangsan1","12"};
        int update = jdbcTemplate.update(sql, objs);
        System.out.println(update);
    }
    /**
     * 查询表记录数
     */
    @Test
    public void searchCont(){
        String sql = "select count(*) from emplooy";
        Integer integer = jdbcTemplate.queryForObject(sql, Integer.class);
        System.out.println(integer);
    }
    /**
     * 查询某个对象
     */
    @Test
    public void qureObject(){
        String sql = "select e_id eId,e_name eNamed,e_age eAge from emplooy where e_id = ?";
        int id = 1;
        Emplooy emplooy = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Emplooy.class),id);
        System.out.println(emplooy);
    }
    /**
     * 查询多个对象
     */
    @Test
    public void qureObjectForLsit(){
        String sql = "select e_id eId,e_name eNamed,e_age eAge from emplooy";
        List<Emplooy> emplooy = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Emplooy.class));
        emplooy.forEach(System.out::println);
    }
    /**
     * 批量添加
     */
    @Test
    public void addEmplooyForBatch(){
        String sql = "insert into emplooy (e_name,e_age) values (?,?)";
        List<Object[]> args = new ArrayList<>();

        Object[] obj1 = {"C#2",14};
        Object[] obj2 = {"Java3",24};
        Object[] obj3 = {"Js4",16};

        args.add(obj1);
        args.add(obj2);
        args.add(obj3);
        int[] ints = jdbcTemplate.batchUpdate(sql, args);
        System.out.println(Arrays.toString(ints));
    }
}
