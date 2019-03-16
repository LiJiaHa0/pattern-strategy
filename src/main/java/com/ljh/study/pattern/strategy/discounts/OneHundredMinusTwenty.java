package com.ljh.study.pattern.strategy.discounts;

/**
 * @description: 优惠卷二，满一百减20
 * @author: Jh Lee
 * @create: 2019-03-16 17:25
 **/
public class OneHundredMinusTwenty implements Discounts {

    //优惠使用价格门槛（需要总金额大于100时才能使用）
    private static final double countPrices = 100.00;

    //优惠的额度
    private static final double limit = 20.00;
    @Override
    public ResultMsg calculate(Order order) {
        //如果总金额大于50元时
        if(order.getPrices() >= countPrices){
            return new ResultMsg(200,"使用成功",order.getPrices() - limit);
        }
        return new ResultMsg(500,"使用失败",order.getPrices());
    }
}
