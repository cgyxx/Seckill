package com.suixingpay.redis;

/**
 * @Author sunshuaiguo
 * @Date 2019/12/8 17:09
 * @Version 1.0
 */
public class SalesmanKey extends BasePrefix{

    private SalesmanKey(String prefix) {
        super(prefix);
    }
    public static SalesmanKey getById = new SalesmanKey("id");
    public static SalesmanKey getByName = new SalesmanKey("name");
}
