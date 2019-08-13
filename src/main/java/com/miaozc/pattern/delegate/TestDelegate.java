package com.miaozc.pattern.delegate;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by miaozc on 2019-8-3.
 * 测试委派模式：静态代理的衍生模式，代理模式注重过程（增强逻辑），委派模式注重结果
 */
public class TestDelegate {
    public static void main(String[] args) {
        Map<String,Employee> employeeMap = new HashMap<>();
        Map<String,Leader> leaderMap = new HashMap<>();
        Employee employee = new Employee("张三");
        employeeMap.put("张三",employee);
        Leader leader  = new Leader(employeeMap);
        leaderMap.put("张三的领导",leader);
        Boss boss = new Boss(leaderMap);
        boss.work("敲代码");
    }
}
