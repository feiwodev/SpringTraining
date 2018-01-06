package com.zeno.processor;

import com.zeno.bean.Person;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.lang.Nullable;

/**
 * bean生命周期处理器 , 可以在创建bean的时候，做很多前置操作，甚至可以替换bean
 */
public class BeanLifecycleProcessor implements BeanPostProcessor{
    /**
     * 执行在init method 之前
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    @Nullable
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessBeforeInitialization");
        if (bean instanceof Person) {
            System.out.println("bean name = "+beanName+" person name = "+((Person) bean).getName());
        }
        return bean;
    }

    /**
     * 执行在 init method 之后 ， destroy之前
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    @Nullable
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessAfterInitialization");
        if (bean instanceof Person) {
            ((Person) bean).setName("xiaoqi");
        }
        return bean;
    }
}
