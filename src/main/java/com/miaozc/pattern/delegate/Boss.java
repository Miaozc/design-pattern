package com.miaozc.pattern.delegate;

import java.util.Map;

/**
 * Created by miaozc on 2019-8-3.
 */
public class Boss {
    private Map<String,Leader> leaderMap ;

    public Boss(Map<String, Leader> leaderMap) {
        this.leaderMap = leaderMap;
    }

    public  void work(String command){
        StringBuilder s = new StringBuilder();
        for (Map.Entry<String ,Leader> leaderEntry:leaderMap.entrySet()){
            String result = leaderEntry.getValue().work(command);
            s.append(result);
        }
        System.out.println("Boss 接受工作结果"+s.toString());

    }
}
