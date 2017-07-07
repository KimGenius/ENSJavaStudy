package com.rinc.basics;

/**
 * Created by young on 2017-07-07.
 */
public class V_DownCastingExam {
    public static void main(String[] args) {
        Object object = new DownPerson();
        System.out.println(object.getClass());
//        System.out.println(object.name); //역시 name이란게 object엔 없어서 안됨

        DownPerson downPerson = (DownPerson) object;
        System.out.println(downPerson.name); //하지만 DownCasting을 하면 다시 자기 본연 객체로 돌아옴
//        DownCasting은 일반적으로는 불가 이유는 JVM이 그 밑의 객체를 알아내지 못함
//        그래서 DownCasting은 UpCasting이 이루어져야만 가능
    }
}

class DownPerson {
    String name = "사람";
    int grade;
}
