package com.rinc.basics;

/**
 * Created by young on 2017-07-07.
 */
public class T_SuperExam extends SuperClass {
    public static void main(String[] args) {
        SC sc = new SC("ㅎㅇ");
        sc.a();
    }
}

class SuperClass {
    int a = 1;

    public SuperClass() {
        System.out.println("생성자");
    }

    public SuperClass(String str) {
        System.out.println("생성자" + str);
    }

    public SuperClass(int a) {
        System.out.println("생성자" + a);
    }

    private void priMethod() {
        System.out.println("private 메소드");
    }

    protected void proMethod() {
        System.out.println("protected 메소드");
    }

    void defMethod() {
        System.out.println("default 메소드");
    }

    public void pubMethod() {
        System.out.println("public 메소드");
    }
}

class SC extends SuperClass {
    public SC() {
        //this는 나한테 있는 것이고 super는 부모 클래스에 있는 것을 의미
        //나한테 있는거 말고 부모 클래스에 있는 것을 찾을 때 쓴다.
        super(); //생성자를 선언하면 자동으로 부모의 생성자도 실행함
        //super의 생성자는 생성자에서만 실행 가능
    }

    public SC(String str) {
        super(str);
    }

    public void a() {
        //생성자 이외에는 외부에서 선언 가능
        super.defMethod();
        super.proMethod();
        super.pubMethod();
        System.out.println(super.a);
        super.a++;
        System.out.println(super.a);
    }
}

