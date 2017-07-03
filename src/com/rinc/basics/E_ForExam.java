package com.rinc.basics;

/**
 * Created by young on 2017-06-30.
 */
public class E_ForExam {
    //반복문 for & foreach 예제
    public static void main(String[] args) {
        //선언 부분
        int[] int_a = new int[3];

        //값 설정
        int_a[0] = 1;
        int_a[1] = 2;
        int_a[2] = 3;

        //출력
        for (int i = 0; i < 3; i++) {
            System.out.println("int a " + i + "번째 : " + int_a[i]);
        }

        for (int i = 2; i >= 0; i--) {
            System.out.println("int a " + i + "번째 : " + int_a[i]);
        }

        System.out.println("\n --- foreach --- \n");

        for (int i : int_a) {
            System.out.println("int a " + (i - 1) + "번째 : " + i);
        }
    }
}
