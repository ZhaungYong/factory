package com.bsoft.abstr;

import com.bsoft.bean.Car;

/**
 * @ClassName: AbstractFactory
 * @Description: TODO
 * @Author: zhuangy
 * @Date: 2019-05-14 09:48
 **/
public abstract class AbstractFactory {
    protected abstract Car getCar();

    public static Car getCar(String name){
        if("audi".equalsIgnoreCase(name)){
            return new AudiFactory().getCar();
        }else if("bmw".equalsIgnoreCase(name)){
            return new BmwFactory().getCar();
        }else if("benchi".equalsIgnoreCase(name)){
            return new BenchiFactory().getCar();
        }else {
            System.out.println("无此汽车,提供默认汽车");
            return new DefaultFactory().getCar();
        }
    }
}
