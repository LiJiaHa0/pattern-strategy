package com.ljh.study.pattern.strategy.discounts;

/**
 * @description: 定义一个总的活动抽象，在定义一个我们优惠活动的价格算法方法
 * @author: Jh Lee
 * @create: 2019-03-16 16:46
 **/
public interface Discounts {

    //传入我们的订单信息，计算我们总订单金额通过我们优惠算法后的所支付算法。
    public ResultMsg calculate (Order order);
}
