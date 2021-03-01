package com.linwei;

/**
 * @date 2021/3/1 8:35
 */
public class School {
    private String name;
    private String addr;

    public School() {
        System.out.println("School无参构造执行！");
    }

    public School(String name, String addr) {
        this.name = name;
        this.addr = addr;
    }

    public void setName(String name) {
        System.out.println("-----?" + name);
        this.name = name;
    }

    public void setAddr(String addr) {
        System.out.println("------->" + addr);
        this.addr = addr;
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", addr='" + addr + '\'' +
                '}';
    }
}
