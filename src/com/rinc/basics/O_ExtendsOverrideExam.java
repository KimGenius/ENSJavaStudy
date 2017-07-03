package com.rinc.basics;

/**
 * Created by young on 2017-07-03.
 */
public class O_ExtendsOverrideExam {
    //상속과 오버라이드 예제
    public static void main(String[] args) {
        KimGenius kimGenius = new KimGenius();
        kimGenius.setName("김영재");
        System.out.println(kimGenius.getName());

        kimGenius.setCoding(true);
        if (kimGenius.isCoding()) {
            System.out.println(kimGenius.getName() + "는(은) 코딩을 할 줄 압니다");
        }
    }
}

class KimGenius extends Human {

    boolean coding;

    public void setCoding(boolean coding) {
        this.coding = coding;
    }

    public boolean isCoding() {
        return coding;
    }

//    Override
//    @Override
//    public void setName(String name) {
//        super.setName(name + "영재");
//    }
}

class Human {
    String name;

    public Human() {
        name = "인간";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
