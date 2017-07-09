package com.rinc.basics;

/**
 * Created by young on 2017-06-30.
 */
public class G_IfExam {
    //조건문 if, &&(AND), ||(OR) 예제
    public static void main(String[] args) {
        int i = 0, j = 1, k = 2;

        if (i == 0) {
            System.out.println("i 는 0 입니다!");
        } else {
            System.out.println("i 는 0이 아닙니다!");
        }
        //1101 ~
        //0101 ^
        //1000

        //12 <<
        //00010100(2) >>
        //24

        if (i == 0) {
            if (j == 1) {
                System.out.println("i는 0이고 j는 1 입니다!");
            }else {
                System.out.println("i는 0이지만 j가 1이 아닙니다!");
            }
        } else {
            System.out.println("i가 0이 아니거나 j가 1이 아닙니다!");
        }

        if (i == 0 && j == 1) {
            System.out.println("i는 0이고 j는 1 입니다!");
        } else {
            System.out.println("i가 0이 아니거나 j가 1이 아닙니다!");
        }

        if (i == 0 || j == 1) {
            System.out.println("i가 0이거나 j가 1 입니다!");
        } else {
            System.out.println("i도 0이 아니고 j도 1이 아닙니다!");
        }

        if (i == 0) {
            System.out.println("i 는 0 입니다!");
        } else if (j == 1) {
            System.out.println("j 는 1 입니다!");
        } else if (k == 2) {
            System.out.println("k 는 2 입니다!");
        } else {
            System.out.println("i 는 0이 아니고 j도 1이 아니고 k도 2가 아닙니다!");
        }

    }
}
