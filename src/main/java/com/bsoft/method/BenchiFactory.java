package com.bsoft.method;

import com.bsoft.bean.BenChi;
import com.bsoft.bean.Car;

/**
 * @ClassName: BenchiFactory
 * @Description: TODO
 * @Author: zhuangy
 * @Date: 2019-05-13 17:13
 **/
public class BenchiFactory implements Factory{
    @Override
    public Car getCar() {
        return new BenChi();
    }
}
