package com.rinc.basics;

/**
 * Created by young on 2017-07-03.
 */
public class M_ObjectMethodExam {
    public static void main(String[] args) {
        Exam exam = new Exam();
        exam.setMessage("ㅁㄴㅇㄹ");
        exam.setMessage("ㅁㄴㅇㄹ",1);
        exam.say();
    }
}

class Exam {
    String message;
    public void say() {
        System.out.println(this.message);
    }
    public void setMessage(String msg, int a) {
        this.message = msg;
    }
    public void setMessage(String msg) {
        this.message = msg;
    }
}
