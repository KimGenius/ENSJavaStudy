package com.rinc.basics;

/**
 * Created by young on 2017-06-30.
 */
public class H_SwitchExam {
    //조건문 switch 예제
    public static void main(String[] args) {
        int i = 0;

        switch (i) {
            case 0:
                System.out.println("i 는 0 입니다!");
                break;
            case 1:
                System.out.println("i 는 1 입니다!");
                break;
            default:
                System.out.println("예외!");
        }
    }
}
