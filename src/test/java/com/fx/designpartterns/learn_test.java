package com.fx.designpartterns;

import com.fx.designpartterns.build.Result;
import com.fx.designpartterns.build.ResultBuild;
import com.fx.designpartterns.build.ResultTypeEnum;
import com.fx.designpartterns.factory.AutowireCapableBeanFactory;
import com.fx.designpartterns.factory.BeanFactory;
import com.fx.designpartterns.factory.bean.BeanDefinition;
import com.fx.designpartterns.factory.bean.PropertyValue;
import com.fx.designpartterns.factory.bean.PropertyValues;
import org.junit.Test;

/**
 * @Author: FangXu
 * @Date: 2020/7/23 20:26
 * @Version 1.0
 */
public class learn_test {
    @Test
    public void testBuild() {
        Result result = ResultBuild.newInstance().type(ResultTypeEnum.SUCCESS)
                .code("0000")
                .message("success")
                .data("请求成功")
                .build();
        System.out.println(result);
    }

    @Test
    public void testBean() throws Exception {
        // 1.初始化beanfactory
        BeanFactory beanFactory = new AutowireCapableBeanFactory();
        // 2.bean定义
        BeanDefinition beanDefinition = new BeanDefinition();
        beanDefinition.setBeanClassName("com.fx.designpartterns.HelloWorldService");
        // 3.设置属性
        PropertyValues propertyValues = new PropertyValues();
        propertyValues.addPropertyValue(new PropertyValue("text", "Hello FX!!"));
        beanDefinition.setPropertyValues(propertyValues);
        // 4.注入bean
        beanFactory.registerBeanDefinition("helloWorldService", beanDefinition);

        // 5.获取bean
        HelloWorldService helloWorldService = (HelloWorldService) beanFactory.getBean("helloWorldService");
        helloWorldService.helloWorld();
    }
}
