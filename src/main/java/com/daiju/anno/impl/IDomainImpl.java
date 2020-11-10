package com.daiju.anno.impl;

import com.daiju.anno.IDomain;
import org.springframework.stereotype.Repository;

/**
 * @Author WDY
 * @Date 2020-11-10 16:28
 * @Description TODO
 */
@Repository
public class IDomainImpl implements IDomain {
    @Override
    public void add() {
        System.out.println("add...");
    }

    @Override
    public void del() {
        System.out.println("del...");
    }

    @Override
    public void update() {
        System.out.println("update...");
    }

    @Override
    public void search() {
        System.out.println("search...");
    }
}
