package com.daiju.anno.impl;

import com.daiju.anno.IDomain;
import com.daiju.anno.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author WDY
 * @Date 2020-11-10 16:24
 * @Description TODO
 */
@Service
public class IServiceImpl implements IService {
    @Autowired
    IDomain iDomain;
    @Override
    public void addStu() {
        iDomain.add();
    }

    @Override
    public void delStu() {
        iDomain.del();
    }

    @Override
    public void updateStu() {
        iDomain.update();
    }

    @Override
    public void searchStu() {
        iDomain.search();
    }
}
