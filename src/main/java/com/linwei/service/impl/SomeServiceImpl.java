package com.linwei.service.impl;

import com.linwei.service.SomeService;

/**
 * @date 2021/3/1 15:04
 */
public class SomeServiceImpl implements SomeService {
    @Override
    public void doSome() {
        System.out.println("----->doSome()");
    }

    @Override
    public void doOther() {
        System.out.println("----->doOther()");
    }
}
