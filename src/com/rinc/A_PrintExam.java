package com.rinc;

public class A_PrintExam {
    //기본 출력 예제
    public static void main(String[] args) {
        System.out.print("첫번째 줄");
        System.out.print("두번째 줄");

        //print는 줄 바꿈을 따로 해줘야 합니다.
        System.out.print("\n\n첫번째 줄\n");
        System.out.print("두번째 줄\n\n");

        //println은 따로 줄바꿈을 안해도 자동으로 뒤에 \n이 붙습니다
        System.out.println("첫번째 줄");
        System.out.println("두번째 줄");
    }
}
