package com.rinc.basics;

/**
 * Created by young on 2017-07-03.
 */
public class P_OverridingExam {
    //메소드 오버라이딩 예제
    public static void main(String[] args) {
        P_OverridingExam pOverridingExam = new P_OverridingExam();
        pOverridingExam.say("김영재");
        pOverridingExam.say("김영재", 19);
    }

    public void say(String name) {
        System.out.println("이름은 : " + name);
    }

    public void say(String name, int age) {
        System.out.println("이름은 : " + name);
        System.out.println("나이는 : " + age);
    }
}

