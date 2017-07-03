package com.rinc.basics;

/**
 * Created by young on 2017-07-03.
 */
public class K_ObjectExam {
    //객체 예제
    public static void main(String[] args) {
        A a = new A();
        a.num = 1;
        a.sum = 2;
        System.out.println(a);
        System.out.println(a.num);
        System.out.println(a.sum);
    }
}

class A {
    int num;
    int sum;
}
