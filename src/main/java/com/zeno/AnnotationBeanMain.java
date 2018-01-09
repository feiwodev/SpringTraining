package com.zeno;

import com.zeno.bean.Config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 常见bean注解类型： @Component @Service @Repository @Controller ， 每一个都是bean容器注解，可以混用，但方便区分，还是建议按照字面意思来进行注解
 */
public class AnnotationBeanMain {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("annotaion-context.xml");
        Config config = (Config) context.getBean("config");
        config.setUser("admin");
        config.setPermissions("管理员");
        System.out.println(config);
    }
}
