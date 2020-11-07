package com.daiju.pojo;

import lombok.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @Author WDY
 * @Date 2020-11-07 17:04
 * @Description TODO
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AttributeInjection {
    private String[] arrays;
    private List<String> lists;
    private Set<Integer> sets;
    private Map<Integer,String> maps;
    private Student student;
    private Emplooy emplooy;
}
