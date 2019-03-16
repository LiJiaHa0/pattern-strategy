package com.ljh.study.pattern.strategy.discounts;

/**
 * @description: 策略模式使用优惠卷test
 * @author: Jh Lee
 * @create: 2019-03-16 17:57
 **/
public class DiscountsTest {
    public static void main(String[] args) {
        //通过我们使用优惠卷的类传入一个新建的订单信息就可以返回我们这个订单优惠后的信息了
        ResultMsg resultMsg = new DiscountsUse().useCoupons(new Order(1L, "2019031600000001", 250.13, DiscountsFactory.TWO_HUNDRED_MINUS_FIFTY));
        System.out.println(resultMsg.toString());
    }
}
