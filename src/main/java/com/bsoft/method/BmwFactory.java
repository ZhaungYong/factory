package com.bsoft.method;

import com.bsoft.bean.Bmw;
import com.bsoft.bean.Car;

/**
 * @ClassName: BmwFactory
 * @Description: TODO
 * @Author: zhuangy
 * @Date: 2019-05-13 17:15
 **/
public class BmwFactory implements Factory{
    @Override
    public Car getCar() {
        return new Bmw();
    }
}
