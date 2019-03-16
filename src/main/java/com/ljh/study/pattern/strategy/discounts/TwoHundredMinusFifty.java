package com.ljh.study.pattern.strategy.discounts;

/**
 * @description: 优惠卷三，满200一50
 * @author: Jh Lee
 * @create: 2019-03-16 17:32
 **/
public class TwoHundredMinusFifty implements Discounts {

    //优惠使用价格门槛（需要总金额大于200时才能使用）
    private static final double countPrices = 200.00;

    private static final double limit = 50.00;

    @Override
    public ResultMsg calculate(Order order) {
        //如果总金额大于50元时
        if(order.getPrices() >= countPrices){
            return new ResultMsg(200,"使用成功",order.getPrices() - limit);
        }
        return new ResultMsg(500,"使用失败",order.getPrices());
    }
}
