package com.linwei.service.impl;

import com.linwei.service.SomeService;

/**
 * @date 2021/3/1 17:17
 */
public class SomeServiceImpl implements SomeService {

    public void doSome(String name, Integer age) {
        System.out.println("目标方法执行！");
    }
}
