package com.zeno;

import com.zeno.bean.Book;
import com.zeno.bean.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringLoadXmlConfig {

    public static void main(String[] args) {
        // ApplicationContext 代表IOC容器
        // ClassPathXmlApplicationContext : 是ApplicationContext容器的实现类， 实现了从类路径下加载bean配置文件 , 将配置中的bean加入到容器中
        ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
        // 通过id来获取容器中的对象
        // getBean 是BeanFactory中的方法
        User user = (User) context.getBean("User");
        System.out.println(user);

        Book book = ((Book) context.getBean("book"));
        System.out.println(book);

        Book book2 = (Book) context.getBean("book2");
        System.out.println(book2);

        // 注入list
        User user1 = (User) context.getBean("user2");
        System.out.println(user1.toString());
    }
}
