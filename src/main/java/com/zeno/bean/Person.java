package com.zeno.bean;

public class Person {

    private String name;
    private Integer age;
    private String info;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", info='" + info + '\'' +
                '}';
    }

    public Person() {
        System.out.println("Person constructor ...");
    }

    /**
     * init method
     */
    public void init() {
        System.out.println("Person init ...");
    }

    /**
     * destroy method
     */
    public void destroy(){
        System.out.println("Person destroy ...");
    }
}
