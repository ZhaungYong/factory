package com.bsoft.abstr;

import com.bsoft.bean.Bmw;
import com.bsoft.bean.Car;

/**
 * @ClassName: BmwFactory
 * @Description: TODO
 * @Author: zhuangy
 * @Date: 2019-05-14 10:15
 **/
public class BmwFactory extends AbstractFactory{
    @Override
    protected Car getCar() {
        return new Bmw();
    }
}
