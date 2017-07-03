package com.rinc.basics;

/**
 * Created by young on 2017-07-03.
 */
public class J_ExceptionExam {
    //오류 처리 try catch finally 예제
    public static void main(String[] args) {
        System.out.println("메소드");
        int[] a = {1, 3};
        try {
            System.out.println(a[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("error : " + e.toString());
        } finally {
            System.out.println("어찌되었든");
        }
//        System.out.println(a[3]); //주석을 풀면 밑에 안녕이 나오지 않고 프로그램이 종료
        System.out.println("안녕");
    }
}
