package com.rinc.basics;

/**
 * Created by young on 2017-07-07.
 */
public class U_UpCastingExam {
    public static void main(String[] args) {
        Person person;
        Student student = new Student("김영재");
        person = student;

        System.out.println("person name : " + person.name);
//        System.out.println("student name : " + person.grade);
//        person은 grade란게 없어서 오류

//        또 다른 예제
        Object obj = new Object();
        System.out.println(obj.getClass());

        Object object = new Person("asdf");
        System.out.println(object.getClass());
    }
}

class Person {
    String name;
    String age;

    public Person(String name) {
        this.name = name;
    }
}

class Student extends Person {
    String grade;
    String name;

    public Student(String name) {
        super(name);
        System.out.println("name : " + name);
    }
}