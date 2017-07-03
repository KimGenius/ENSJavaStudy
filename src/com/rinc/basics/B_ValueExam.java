package com.rinc.basics;

/**
 * Created by young on 2017-06-30.
 */
public class B_ValueExam {
    //자료형 예제
    public static void main(String[] args) {
        int int_a = 1;
        int int_b = 2;
        long log_a = 1;
        double dou_a = 1.0;
        float flo_a = 1.0f;
        char cha_a = 'a';
        char cha_b = 'ㄱ';

        //String은 자료형이 아닌 클래스입니다
        String str_a = "asdf";
        String str_b = "a";

        //int + int
        System.out.println(int_a + int_b);

        //int + long
        System.out.println(int_a + log_a);

        //int + double
        System.out.println(int_a + dou_a);

        //int + float
        System.out.println(int_a + flo_a);

        //int + char
        System.out.println(int_a + cha_a);

        //char + char
        System.out.println(cha_a + cha_b);

        //String + char
        System.out.println(str_a + cha_a);

        //String + int
        System.out.println(str_a + int_a);

        //String + String
        System.out.println(str_a + str_b);
    }
}
