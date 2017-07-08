package com.rinc.basics;

/**
 * Created by young on 2017-07-08.
 */
public class NewExam {
    public static void main(String[] args) {
//        AB kim = new AB(1, "김똑똑");
//        AB lee = new AB("이똑똑");
//        AB ab = new AB();
//        ab.getNo();
        AB.getNo();
        System.out.println();
    }
}

class AB {
    static int no;
    String name;
    int ban;

    public static int getNo() {
        return no;
    }

    public AB(int no, String name) {
        this.no = no;
        this.name = name;
        this.ban = 2;
    }

    public AB(String name) {
        this.ban = 2;
        this.name = name;
    }

    public AB() {

    }
}

