package com.ljh.study.pattern.strategy.discounts;

/**
 * @description: 通过我们的订单信息来使用我们的优惠卷算法
 * @author: Jh Lee
 * @create: 2019-03-16 17:34
 **/
public class DiscountsUse {

    //优惠卷的使用方法，通过我们的优惠卷工厂来获取我们的具体的优惠卷使用算法
    public ResultMsg useCoupons(Order order){
        return DiscountsFactory.getDiscounts(order.getDiscountsKey()).calculate(order);
    }
}