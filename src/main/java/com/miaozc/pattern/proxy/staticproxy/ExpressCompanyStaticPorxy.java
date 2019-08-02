package com.miaozc.pattern.proxy.staticproxy;

import com.miaozc.pattern.proxy.ICustomer;

/**
 * Created by miaozc on 2019-8-1.
 * 快递公司（proxy）
 */
public class ExpressCompanyStaticPorxy {
    private ICustomer iCustomer;

    public ExpressCompanyStaticPorxy(ICustomer iCustomer) {
        this.iCustomer = iCustomer;
    }

    public void send(){
        this.iCustomer.send();
        System.out.println("快递公司发出快递");
    }

}
