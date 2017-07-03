package com.rinc.basics;

/**
 * Created by young on 2017-06-30.
 */
public class C_PlPlExam {
    //증감, 감소 예제
    public static void main(String[] args) {
        int i = 0;
        System.out.println(i++);
        System.out.println(++i);
        System.out.println(i--);
        System.out.println(--i);

        System.out.println();

        int b = 0;
        b++;
        System.out.println(b);
        b = b + 1;
        System.out.println(b);
        b += 1;
        System.out.println(b);
        b += b;
        System.out.println(b);
    }
}
