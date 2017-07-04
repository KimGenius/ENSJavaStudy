package com.rinc.basics;

/**
 * Created by young on 2017-07-04.
 */
public class R_AbstractExam {
    public static void main(String[] args) {
        Mentee mentee = new Mentee();
        GeniusMentee geniusMentee = new GeniusMentee();
        System.out.println(mentee.getJava(30));
        System.out.println(geniusMentee.getJava(30));
    }
}

abstract class MenteeClass {
    abstract public int getJava(int sum); //java 성적을 반환
}

class Mentee extends MenteeClass {
    @Override
    public int getJava(int sum) { //java 성적을 반환하는 메소드 구현
        return sum;
    }
}

class GeniusMentee extends MenteeClass {
    @Override
    public int getJava(int sum) { //java 성적을 반환하는 메소드 구현
        return sum*sum;
    }
}