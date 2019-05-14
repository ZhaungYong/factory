package com.bsoft.abstr;

/**
 * @ClassName: TestFactory
 * @Description: TODO
 * @Author: zhuangy
 * @Date: 2019-05-14 10:49
 **/
public class TestFactory {
    public static void main(String[] args) {
        AbstractFactory.getCar("bm").drive();
    }
}
