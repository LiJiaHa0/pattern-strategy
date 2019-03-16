package com.ljh.study.pattern.strategy.discounts;

/**
 * @description: 记录我们计算使用优惠卷的后返回的信息
 * @author: Jh Lee
 * @create: 2019-03-16 17:16
 **/
public class ResultMsg {

    private int code;

    private String msg;

    private Object data;

    public ResultMsg(int code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "使用优惠券的结果为：" +
                "成功编码：" + code +
                ", 信息：'" + msg + '\'' +
                ", 订单金额为：" + data +
                '}';
    }
}
