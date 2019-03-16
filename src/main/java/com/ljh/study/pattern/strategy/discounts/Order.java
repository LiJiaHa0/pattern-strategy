package com.ljh.study.pattern.strategy.discounts;

/**
 * @description: 我们的整个简易的订单信息
 * @author: Jh Lee
 * @create: 2019-03-16 16:49
 **/
public class Order {

    //订单提交人的id
    private Long uId;

    //订单编号
    private String orderNo;

    //我们在购物时的总购物价格
    private double prices;

    private String discountsKey;


    public Order(Long uId, String orderNo, double prices, String discountsKey) {
        this.uId = uId;
        this.orderNo = orderNo;
        this.prices = prices;
        this.discountsKey = discountsKey;
    }

    public Long getuId() {
        return uId;
    }

    public void setuId(Long uId) {
        this.uId = uId;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public double getPrices() {
        return prices;
    }

    public void setPrices(double prices) {
        this.prices = prices;
    }

    public String getDiscountsKey() {
        return discountsKey;
    }

    public void setDiscountsKey(String discountsKey) {
        this.discountsKey = discountsKey;
    }
}
