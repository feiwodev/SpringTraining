package com.zeno;

import com.zeno.bean.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpelXmlConfigMain {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spel-context.xml");
        Person person = (Person) context.getBean("person");
        System.out.println(person);

        Person person1 = (Person) context.getBean("person3");
        System.out.println(person1);
    }
}
