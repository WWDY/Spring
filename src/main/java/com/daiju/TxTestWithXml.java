package com.daiju;

import com.daiju.transaction.service.UserService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

/**
 * @Author WDY
 * @Date 2020-11-21 13:29
 * @Description TODO
 */
@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = "classpath:application4.xml")
public class TxTestWithXml {
    @Autowired
    @Qualifier("tx_userService")
    UserService userService;
    @Test
    public void test(){
        userService.account();
    }
}
