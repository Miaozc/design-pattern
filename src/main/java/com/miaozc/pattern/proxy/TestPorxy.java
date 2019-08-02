package com.miaozc.pattern.proxy;

import com.miaozc.pattern.proxy.dynamicproxy.cglib.ExpressCompanyCGLibProxy;
import com.miaozc.pattern.proxy.dynamicproxy.jdkproxy.ExpressCompanyJDKProxy;
import com.miaozc.pattern.proxy.staticproxy.ExpressCompanyStaticPorxy;

/**
 * 测试代理
 * Created by miaozc on 2019-8-3.
 */
public class TestPorxy {
    public static void main(String[] args) throws Exception {
        //静态代理
        ICustomer customer = new Customer("张三");
        ExpressCompanyStaticPorxy expressCompanyStaticPorxy = new ExpressCompanyStaticPorxy(customer);
        expressCompanyStaticPorxy.send();
        //jdk动态代理
        ICustomer jdkCustomer = (ICustomer) new ExpressCompanyJDKProxy().getInstance(new Customer("李四"));
        ICustomer jdkRobot = (ICustomer) new ExpressCompanyJDKProxy().getInstance(new Robot("狗子"));
        customer.send();
        jdkRobot.send();
        //cglib动态代理
        Class[] argumentTypes = new Class[]{String.class};
        Object[] personArguments = new Object[]{"王五"};
        Object[] robotArguments = new Object[]{"二哈"};
        Customer cglibCustomer = (Customer) new ExpressCompanyCGLibProxy().getInstance(Customer.class,argumentTypes,personArguments);
        Robot cglibRobot = (Robot) new ExpressCompanyCGLibProxy().getInstance(Robot.class,argumentTypes,robotArguments);
        Robot cglibRobotCreate = (Robot) new ExpressCompanyCGLibProxy().getInstance(Robot.class,null,null);
        cglibCustomer.send();
        cglibRobot.send();
        cglibRobotCreate.send();
    }
}
