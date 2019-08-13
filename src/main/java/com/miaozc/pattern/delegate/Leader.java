package com.miaozc.pattern.delegate;

import java.util.Map;

/**
 * Created by miaozc on 2019-8-3.
 */
public class Leader {
    private Map<String,Employee> emps;

    public Leader(Map<String, Employee> emps) {
        this.emps = emps;
    }

    public String work(String command){
        StringBuilder s = new StringBuilder();
        for (Map.Entry<String ,Employee> employeeEntry:emps.entrySet()){
            String result = employeeEntry.getValue().doIt(command);
            s.append(result);
        }
        return  s.toString();
    }
}
