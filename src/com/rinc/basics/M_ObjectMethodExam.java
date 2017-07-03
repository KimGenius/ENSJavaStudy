package com.rinc.basics;

/**
 * Created by young on 2017-07-03.
 */
public class M_ObjectMethodExam {
    public static void main(String[] args) {

    }
}

class Exam {
    String message;
    private void say() {
        System.out.println(this.message);
    }
    private void setMessage(String msg) {
        this.message = msg;
    }
}
