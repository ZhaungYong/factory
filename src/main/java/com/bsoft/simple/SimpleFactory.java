package com.bsoft.simple;

import com.bsoft.bean.Audi;
import com.bsoft.bean.Bmw;
import com.bsoft.bean.BenChi;
import com.bsoft.bean.Car;

/**
 * @ClassName: SimpleFactory
 * @Description: TODO
 * @Author: zhuangy
 * @Date: 2019-05-13 16:37
 **/
public class SimpleFactory {
    public static Car getInstance(String name) {
        switch (name) {
            case "benchi":
                return new BenChi();
            case "audi":
                return new Audi();
            case "bmw":
                return new Bmw();
        }
        return null;
    }
}
