package com.rinc.basics;

/**
 * Created by young on 2017-06-30.
 */
public class G_IfExam {
    //조건문 if, &&(AND), ||(OR) 예제
    public static void main(String[] args) {
        int i = 0, j = 1, k = 2;

        if (i == 3) {
            System.out.println("i 는 0 입니다!");
        } else {
            System.out.println("i 는 0이 아닙니다!");
        }
        // 조건 ? 조건맞을때 Tod o : 조건이 안 맞을때 TOD o
        System.out.println(i == 3 ? "i 는 0 입니다!" : "i 는 0이 아닙니다!");

        //1101 ~
        //0101 ^
        //1000

        //12 <<
        //00010100(2) >>
        //24
//i = 0, j = 1
        if (i == 0) {
            if (j == 1) {
                System.out.println("i는 0이고 j는 1 입니다!");
            } else {
                System.out.println("i는 0이지만 j가 1이 아닙니다!");
            }
        } else {
            System.out.println("i가 0이 아니거나 j가 1이 아닙니다!");
        }

// && 둘 다 true일때 true
        if (i == 0 && j != 2) {
            System.out.println("i는 0이고 j는 1 입니다!");
        } else {
            System.out.println("i가 0이 아니거나 j가 1이 아닙니다!");
        }

        if (i == 0 || j == 5) {
            System.out.println("i가 0이거나 j가 1 입니다!");
        } else {
            System.out.println("i도 0이 아니고 j도 1이 아닙니다!");
        }
//i = 0 j =1 k 2
        if (i == 1) {
            System.out.println("i 는 0 입니다!");
        } else if (++j == 1) {
            System.out.println("j 는 1 입니다!");
        } else if (k++ == 2) {
            System.out.println("k 는 2 입니다!");
        } else {
            System.out.println("i 는 0이 아니고 j도 1이 아니고 k도 2가 아닙니다!");
        }


        int a = 3;
        int b = 5;

        //true
        if ((a == 4 || b == 5) && (a != 4 && b == 5)) {
            int num = ++a == --b ? 90 : 40;
            //true ? 90 : 40;
            System.out.println("당연히 제 점수는 " + num + "는 되죠~!");
        } else {
            System.out.println("80점을 못 넘겨요ㅠ");
        }
    }
}
