package com.bsoft.abstr;

import com.bsoft.bean.Audi;
import com.bsoft.bean.Car;

/**
 * @ClassName: AudiFactory
 * @Description: TODO
 * @Author: zhuangy
 * @Date: 2019-05-14 10:13
 **/
public class AudiFactory extends AbstractFactory{
    @Override
    protected Car getCar() {
        return new Audi();
    }
}
