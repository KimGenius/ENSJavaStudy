package com.rinc.basics;

/**
 * Created by young on 2017-06-30.
 */
public class F_WhileExam {
    //반복문 while & do-while 예제
    public static void main(String[] args) {
        //선언 부분
        int[] int_a = new int[3];

        //값 설정
        int_a[0] = 1;
        int_a[1] = 2;
        int_a[2] = 3;

        //출력
        int i = 0;
        while (i < 3) {
            System.out.println("int a " + i + "번째 : " + int_a[i]);
            i++;
        }

        int j = 2;
        while (j > 0) {
            System.out.println("int a " + j + "번째 : " + int_a[j]);
            j--;
        }

        System.out.println("\n --- do-while --- \n");

        int k = 0;
        do {
            System.out.println("int a " + k + "번째 : " + int_a[k]);
            k++;
        } while (k < 3);
    }
}
