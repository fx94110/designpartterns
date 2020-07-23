package com.fx.designpartterns;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: FangXu
 * @Date: 2020/7/8 10:43
 * @Version 1.0
 */
public class PropertyValues {

    private final List<PropertyValue> propertyValueList = new ArrayList<PropertyValue>();

    public PropertyValues() {
    }

    public void addPropertyValue(PropertyValue pv) {

        this.propertyValueList.add(pv);
    }

    public List<PropertyValue> getPropertyValueList() {
        return propertyValueList;
    }
}
