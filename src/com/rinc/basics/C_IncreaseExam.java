package com.rinc.basics;

/**
 * Created by young on 2017-06-30.
 */
public class C_IncreaseExam {
    //증감, 감소 예제
    public static void main(String[] args) {
        int i = 0;
        System.out.println(i++); // 0
        //1
        System.out.println(++i); // 2
        //2
        System.out.println(i--); // 2
        //1
        System.out.println(--i); // 0

        System.out.println();

        int b = 0;
        b++;
        System.out.println(b); // 1
        b = b + 1;
        System.out.println(b); //2
        b += 1;
        System.out.println(b); //3
        b += b;
        System.out.println(b); //6
    }
}
