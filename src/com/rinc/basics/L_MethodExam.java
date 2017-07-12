package com.rinc.basics;

/**
 * Created by young on 2017-07-03.
 */
public class L_MethodExam {
    //메소드 예제
    public static void main(String[] args) {
        L_MethodExam lMethodExam = new L_MethodExam();
        lMethodExam.say("ㅎㅇ");
        lMethodExam.say("반가워");
    }

    public L_MethodExam() {
        System.out.println("생성자");
    }

    public L_MethodExam(int a) {
        System.out.println(a);
    }

    private void say(String message) {
        System.out.println(message);
    }
}
