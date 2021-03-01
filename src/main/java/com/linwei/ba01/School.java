package com.linwei.ba01;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @date 2021/3/1 12:54
 */

@Component("mySchool")
public class School {

    @Value("伦敦大学")
    private String name;
    @Value("英国")
    private String addr;


    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", addr='" + addr + '\'' +
                '}';
    }
}
