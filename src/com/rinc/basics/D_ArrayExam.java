package com.rinc.basics;

import java.util.ArrayList;

/**
 * Created by young on 2017-06-30.
 */
public class D_ArrayExam {
    //배열 예제
    public static void main(String[] args) {
        //선언 부분
        int[] int_a = new int[3];
        int int_b[] = new int[3];
        int[] int_c = new int[]{1, 2, 3};
        int[] int_d = {1, 2, 3};
        int[] int_e = int_d;

        char[] cha_a = new char[3];
        float[] flo_a = new float[3];
        double[] dou_a = new double[3];
        String[] str_a = new String[3];

        int[][] arr = new int[3][3];
        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[0][2] = 3;

        System.out.println(arr[0][0]);
        System.out.println(arr[0][1]);
        System.out.println(arr[0][2]);

        //값 설정
        int_a[0] = 1;
        int_a[1] = 2;
        int_a[2] = 3;

        int_b[0] = 4;
        int_b[1] = 5;
        int_b[2] = 6;

        cha_a[0] = 'a';
        cha_a[1] = 'b';
        cha_a[2] = 'c';

        flo_a[0] = 1.0f;
        flo_a[1] = 2.0f;
        flo_a[2] = 3.0f;

        dou_a[0] = 4.0;
        dou_a[1] = 5.0;
        dou_a[2] = 6.0;

        str_a[0] = "str0";
        str_a[1] = "str1";
        str_a[2] = "str2";

        System.out.println("int a 0번째 : " + int_a[0]);
        System.out.println("int a 1번째 : " + int_a[1]);
        System.out.println("int a 2번째 : " + int_a[2] + "\n");

        System.out.println("int b 0번째 : " + int_b[0]);
        System.out.println("int b 1번째 : " + int_b[1]);
        System.out.println("int b 2번째 : " + int_b[2] + "\n");

        System.out.println("int c 0번째 : " + int_c[0]);
        System.out.println("int c 1번째 : " + int_c[1]);
        System.out.println("int c 2번째 : " + int_c[2] + "\n");

        System.out.println("int d 0번째 : " + int_d[0]);
        System.out.println("int d 1번째 : " + int_d[1]);
        System.out.println("int d 2번째 : " + int_d[2] + "\n");

        System.out.println("int e 0번째 : " + int_e[0]);
        System.out.println("int e 1번째 : " + int_e[1]);
        System.out.println("int e 2번째 : " + int_e[2] + "\n");

        System.out.println("cha a 0번째 : " + cha_a[0]);
        System.out.println("cha a 1번째 : " + cha_a[1]);
        System.out.println("cha a 2번째 : " + cha_a[2] + "\n");

        System.out.println("flo a 0번째 : " + flo_a[0]);
        System.out.println("flo a 1번째 : " + flo_a[1]);
        System.out.println("flo a 2번째 : " + flo_a[2] + "\n");

        System.out.println("dou a 0번째 : " + dou_a[0]);
        System.out.println("dou a 1번째 : " + dou_a[1]);
        System.out.println("dou a 2번째 : " + dou_a[2] + "\n");

        System.out.println("str a 0번째 : " + str_a[0]);
        System.out.println("str a 1번째 : " + str_a[1]);
        System.out.println("str a 2번째 : " + str_a[2] + "\n");
    }
}
