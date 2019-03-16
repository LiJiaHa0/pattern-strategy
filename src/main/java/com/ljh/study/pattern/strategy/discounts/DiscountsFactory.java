package com.ljh.study.pattern.strategy.discounts;

import java.util.HashMap;
import java.util.Map;

/**
 * @description: 通过我们的简单工厂模式，把我们全部优惠卷注入
 * @author: Jh Lee
 * @create: 2019-03-16 17:38
 **/
public class DiscountsFactory {

    //满五十减七
    public static final String FIFTY_MINUS_SEVER = "fiftyMinusSever";

    //满一百减
    public static final String ONE_HUNDRED_MINUS_TWENTY = "oneHundredMinusTwenty";

    //满两百减五十
    public static final String TWO_HUNDRED_MINUS_FIFTY = "twoHundredMinusFifty";


    //简单工厂的工厂容器
    private static Map<String,Discounts> discountsFactory = new HashMap<String,Discounts>();

    //通过静态代理块的类加载顺序来实例化工厂容器
    static{
        discountsFactory.put(FIFTY_MINUS_SEVER,new FiftyMinusSeven());
        discountsFactory.put(ONE_HUNDRED_MINUS_TWENTY,new OneHundredMinusTwenty());
        discountsFactory.put(TWO_HUNDRED_MINUS_FIFTY,new TwoHundredMinusFifty());
    }

    //通过优惠卷的key来判断是否存在我们的优惠卷
    public static Discounts getDiscounts(String key){
        if(discountsFactory.containsKey(key)){
            return discountsFactory.get(key);
        }
        return new NoneDiscount();
    }
}
