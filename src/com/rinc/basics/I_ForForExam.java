package com.rinc.basics;

/**
 * Created by young on 2017-07-03.
 */
public class I_ForForExam {
    //2중 for문 예제
    public static void main(String[] args) {
//        for (int i = 0; i <= 2; i++) { //0 1 2 3
//            for (int j = 0; j <= 2; j++) { //0 1 2 3
//                System.out.println("i : " + i + " j : " + j);
//            }
//        }
//        for (int i = 0; i < 5; i++) { //0 1 2 3 4
//            for (int j = 0; j <= i; j++) { //5 <= 4
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for (int i = 1; i <= 5; i++) { //1 2 3 4
//            for (int j = 1; j <= 5; j++) { //0<=5
//                System.out.print(j + "\t");
//            }
//            System.out.println();
//        }
//        for (int i = 1; i <= 5; i++) { //1 2 3 4 5 6
//            for (int j = 1; j <= i; j++) {  // 6<=5
//                System.out.print(j + "\t");
//            }
//            System.out.println();
//        }

        for (int i = 3; i >= 1; i--) { //3 2 1
            for (int j = 1; j <= i; j++) { //2 < = 1
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
