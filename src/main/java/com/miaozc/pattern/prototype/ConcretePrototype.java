package com.miaozc.pattern.prototype;

import java.io.Serializable;
import java.util.List;

/**
 *
 * Created by miaozc on 2019-4-20.
 */
public class ConcretePrototype extends Prototype  implements Cloneable, Serializable {

    private List<String> list = null;
    private String name = null;


    public ConcretePrototype(List<String> list, String name) {
        this.list = list;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }
}
