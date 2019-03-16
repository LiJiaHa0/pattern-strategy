package com.ljh.study.pattern.strategy.discounts;

/**
 * @description: 没有此优惠卷
 * @author: Jh Lee
 * @create: 2019-03-16 17:51
 **/
public class NoneDiscount implements Discounts {
    @Override
    public ResultMsg calculate(Order order) {
        return new ResultMsg(500,"暂无此优惠卷",order.getPrices());
    }
}
