package com.yimayhd.util;

/**
 * Created by Administrator on 2015/10/27.
 */
public class UtilNumble {

    /**
     * 金额转换（分转换为元）
     * @param money
     * @return
     */
    public static double moneyTransform(long money){
        double dn = money;
        return dn/100;
    }



}
