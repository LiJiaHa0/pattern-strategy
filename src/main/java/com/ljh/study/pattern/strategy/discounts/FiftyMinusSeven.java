package com.ljh.study.pattern.strategy.discounts;

/**
 * @description: 优惠卷一，满50减7
 * @author: Jh Lee
 * @create: 2019-03-16 16:51
 **/
public class FiftyMinusSeven implements Discounts {

    //优惠使用价格门槛（需要总金额大于50时才能使用）
    private static final double countPrices = 50.00;

    //优惠的额度
    private static final double limit = 7.00;

    @Override
    public ResultMsg calculate(Order order) {
        //如果总金额大于50元时
        if(order.getPrices() >= countPrices){
            return new ResultMsg(200,"使用成功",order.getPrices() - limit);
        }
        return new ResultMsg(500,"使用失败",order.getPrices());
    }
}
