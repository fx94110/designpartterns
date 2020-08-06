package com.fx.designpartterns.factory;


import com.fx.designpartterns.factory.bean.BeanDefinition;
import com.fx.designpartterns.factory.bean.PropertyValue;

import java.lang.reflect.Field;

/**
 * @Author: FangXu
 * @Date: 2020/6/30 17:03
 * @Version 1.0
 */
public class AutowireCapableBeanFactory extends AbstractBeanFactory {

    @Override
    protected Object doCreateBean(BeanDefinition beanDefinition) throws Exception {
        Object bean = this.createBeanInstance(beanDefinition);
        this.applyPropertyValues(bean, beanDefinition);
        return bean;
    }

    private Object createBeanInstance(BeanDefinition beanDefinition)  throws Exception {
        return beanDefinition.getBeanClass().newInstance();
    }

    private void applyPropertyValues(Object bean, BeanDefinition beanDefinition) throws Exception {
        for (PropertyValue propertyValue : beanDefinition.getPropertyValues().getPropertyValueList()) {
            Field declaredField = bean.getClass().getDeclaredField(propertyValue.getName());
            declaredField.setAccessible(true);
            declaredField.set(bean, propertyValue.getValue());
        }
    }
}
