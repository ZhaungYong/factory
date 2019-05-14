package com.bsoft.abstr;

import com.bsoft.bean.Car;

/**
 * @ClassName: DefaultFactory
 * @Description: TODO
 * @Author: zhuangy
 * @Date: 2019-05-14 10:16
 **/
public class DefaultFactory extends AbstractFactory {
    private AudiFactory defaultFactory = new AudiFactory();

    @Override
    protected Car getCar() {
        return defaultFactory.getCar();
    }
}
