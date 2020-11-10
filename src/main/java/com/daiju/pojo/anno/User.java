package com.daiju.pojo.anno;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @Author WDY
 * @Date 2020-11-09 18:27
 * @Description TODO
 */
@Component
@NoArgsConstructor
@AllArgsConstructor
@Data
public class User {
    @Value("zhangsan")
    private String uName;
    @Value("28")
    private Integer uAge;
}
