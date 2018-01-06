package com.zeno;

import com.zeno.bean.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * bean 的生命周期与生命周期处理器
 */
public class LifecycleBeanMain {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("lifecycle-context.xml");
        Person person = (Person) applicationContext.getBean("person");
        System.out.println(person);
        // 关闭容器
        applicationContext.close();
    }
}
