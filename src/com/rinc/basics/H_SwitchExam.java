package com.rinc.basics;

/**
 * Created by young on 2017-06-30.
 */
public class H_SwitchExam {
    //조건문 switch 예제
    public static void main(String[] args) {
        int i = 1;
        String a = "abc";

//        if (i == 0) {
//            System.out.println("i 는 0 입니다!");
//        } else if (i == 1) {
//            System.out.println("i 는 1 입니다!");
//        } else {
//            System.out.println("예외!");
//        }

        switch (a) {
            case "abc":
                System.out.println("a 는 abc 입니다!");
                break;
            case "a":
                System.out.println("a 는 a 입니다!");
                break;
            default:
                System.out.println("예외!");
        }
    }
}
