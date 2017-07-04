package com.rinc.expert;

import java.util.Scanner;

/**
 * Created by young on 2017-07-04.
 */
public class A_SimpleGameExam {
    public static void main(String[] args) {
        int answer = (int) (Math.random() * 10) + 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("랜덤한 숫자가 정해졌습니다!");
        while (true) {
            int a = scanner.nextInt();
            if (a == answer) {
                System.out.println("정답!");
                break;
            } else {
                System.out.println("정답이 아닙니다");
            }
        }
    }
}

