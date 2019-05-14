package com.bsoft.abstr;

import com.bsoft.bean.BenChi;
import com.bsoft.bean.Car;

/**
 * @ClassName: BenchiFactory
 * @Description: TODO
 * @Author: zhuangy
 * @Date: 2019-05-14 10:13
 **/
public class BenchiFactory extends AbstractFactory {
    @Override
    protected Car getCar() {
        return new BenChi();
    }
}
