package com.bsoft.method;

import com.bsoft.bean.Car;

/**
 * @ClassName: FactoryTest
 * @Description: TODO
 * @Author: zhuangy
 * @Date: 2019-05-14 09:42
 **/
public class FactoryTest {
    public static void main(String[] args) {
        Factory audiFactory = new AudiFactory();
        Car audi = audiFactory.getCar();
        audi.drive();
    }
}
