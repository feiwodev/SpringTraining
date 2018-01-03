package com.zeno;

import com.zeno.bean.Disc;
import com.zeno.bean.Music;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RelationXmlConfigMain {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("relation-context.xml");

        Music music = (Music) context.getBean("music");
        System.out.println(music);

        music = (Music) context.getBean("music2");
        System.out.println(music);

        music = (Music) context.getBean("music3");
        System.out.println(music);

        Disc disc = (Disc) context.getBean("disc");
        System.out.println(disc);
    }
}
