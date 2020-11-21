package com.daiju.transaction.dao.impl;

import com.daiju.transaction.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @Author WDY
 * @Date 2020-11-21 13:15
 * @Description TODO
 */
public class UserDaoImpl implements UserDao {
    @Autowired
    JdbcTemplate jdbcTemplate;
    @Override
    public void addMoney() {
        String sql = "update tx_user set money = money + ? where id = ?";
        jdbcTemplate.update(sql,100,1);

    }

    @Override
    public void reduceMoney() {
        String sql = "update tx_user set money = money - ? where id = ?";
        jdbcTemplate.update(sql, 100, 2);
    }
}
