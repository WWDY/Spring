package com.daiju.anno;

import org.springframework.stereotype.Repository;

/**
 * @Author WDY
 * @Date 2020-11-10 16:27
 * @Description TODO
 */

public interface IDomain {
    public void add();
    public void del();
    public void update();
    public void search();
}
