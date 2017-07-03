package com.rinc.basics;

/**
 * Created by young on 2017-07-03.
 */
public class N_ObjectConstruct {
    public static void main(String[] args) {
        ExamConstruct examConstruct = new ExamConstruct();
        examConstruct.info();
    }
}

class ExamConstruct {
    int age;
    String name;

    public ExamConstruct() {
        age = 19;
        name = "김영재";
    }

    public void info() {
        System.out.println("나이 : " + age);
        System.out.println("이름 : " + name);
    }
}

