package com.rinc.basics;

/**
 * Created by young on 2017-06-30.
 */
public class B_ValueExam {
    //자료형 예제
    public static void main(String[] args) {
        int int_a = 1;
        int int_b = 2; //21억
        long log_a = 1; //21억 >
        double dou_a = 1.0;  // 123 23 546 12.34
        float flo_a = 1.0f; //
        char cha_a = 'a'; //ㄱ ㄴ 1+'a' -> 98
        char cha_b = 'ㄱ';
        boolean bool_a = true; //true false
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
        System.out.println("asdf" + int_a); // asdf1 -> "asdf1"

        //String + String
        System.out.println(str_a + str_b);

        //boolean
        System.out.println(bool_a);

        //boolean + String
        System.out.println(bool_a + str_a);

        //boolean + !String 은 전부 오류

    }
}
