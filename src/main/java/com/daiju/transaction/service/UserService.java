package com.daiju.transaction.service;

import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author WDY
 * @Date 2020-11-21 13:14
 * @Description TODO
 */
@Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.SERIALIZABLE)
public interface UserService {
    void account();
}
