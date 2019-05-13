package com.bsoft.method;

import com.bsoft.bean.Audi;
import com.bsoft.bean.Car;

/**
 * @ClassName: AudiFactory
 * @Description: TODO
 * @Author: zhuangy
 * @Date: 2019-05-13 17:14
 **/
public class AudiFactory implements Factory{
    @Override
    public Car getCar() {
        return new Audi();
    }
}
