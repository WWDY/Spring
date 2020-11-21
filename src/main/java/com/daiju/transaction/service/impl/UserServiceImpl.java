package com.daiju.transaction.service.impl;

import com.daiju.transaction.dao.UserDao;
import com.daiju.transaction.dao.impl.UserDaoImpl;
import com.daiju.transaction.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @Author WDY
 * @Date 2020-11-21 13:16
 * @Description TODO
 */
public class UserServiceImpl implements UserService {
    @Autowired
    @Qualifier("tx_userDao")
    UserDao userDao;
    @Override
    public void account() {
        userDao.addMoney();
        int i = 3 / 0;
        userDao.reduceMoney();
    }
}
