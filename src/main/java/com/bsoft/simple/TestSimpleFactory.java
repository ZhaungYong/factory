package com.bsoft.simple;

import com.bsoft.bean.Car;

/**
 * @ClassName: TestSimpleFactory
 * @Description: TODO
 * @Author: zhuangy
 * @Date: 2019-05-13 16:49
 **/
public class TestSimpleFactory {
    public static void main(String[] args) {
        Car car = SimpleFactory.getInstance("bench");
        if (car != null) {
            car.drive();
        }
    }
}
