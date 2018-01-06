package com.zeno;

import com.zeno.bean.DataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PropertiesLoadConfigMain {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("properties-context.xml");
        DataSource source = (DataSource) context.getBean("dataSource");
        System.out.println(source);
    }
}
