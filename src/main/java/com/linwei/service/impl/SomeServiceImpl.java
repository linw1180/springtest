package com.linwei.service.impl;

import com.linwei.service.SomeService;
import org.springframework.stereotype.Service;

/**
 * @date 2021/3/1 20:15
 */
@Service("someService")
public class SomeServiceImpl implements SomeService {
    @Override
    public String doSome(String name, Integer age) {

        System.out.println("目标方法执行=======");
        return "abc";
    }

    @Override
    public Integer doFirst(Integer num1, Integer num2) {
        System.out.println("doFirst()目标方法执行！");
        return num1 + num2;
    }

    @Override
    public String doLast(String name, Integer age) {

        System.out.println("doLast()目标方法执行===========");
        return "ooooo";
    }
}
