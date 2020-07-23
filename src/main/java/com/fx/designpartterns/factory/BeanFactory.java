package com.fx.designpartterns.factory;


import com.fx.designpartterns.BeanDefinition;


/**
 * @Author: FangXu
 * @Date: 2020/6/24 16:10
 * @Version 1.0
 */
public interface BeanFactory {

    /*private Map<String, BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<String, BeanDefinition>();

    public Object getBean(String beanName) {
        return beanDefinitionMap.get(beanName).getBean();
    }

    // 注入bean
    public void registerBeanDefinition(String beanName, BeanDefinition beanDefinition) {
        beanDefinitionMap.put(beanName, beanDefinition);
    }*/

   Object getBean(String name);

   void registerBeanDefinition(String name, BeanDefinition beanDefinition);
}
