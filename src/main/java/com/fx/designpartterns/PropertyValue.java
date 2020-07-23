package com.fx.designpartterns;

/**
 * @Author: FangXu
 * @Date: 2020/7/8 10:39
 * @Version 1.0
 */
public class PropertyValue {

    private final String name;

    private final Object value;

    public PropertyValue(String name, Object value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public Object getValue() {
        return value;
    }
}
