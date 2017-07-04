package com.rinc.basics;

import com.rinc.access.DefaultClass;
import com.rinc.access.PrivateClass;
import com.rinc.access.ProtectClass;
import com.rinc.access.PublicClass;

/**
 * Created by young on 2017-07-03.
 */
public class P_AccessExam extends ProtectClass {
    //접근제어자 예제
    public static void main(String[] args) {
        P_AccessExam pAccessExam = new P_AccessExam();
        pAccessExam.protectStatus = "상속 설정 성공";    // 상속을 안하면 protect로 선언한거 사용 불가

        PublicClass publicClass = new PublicClass();
        publicClass.publicStatus = "공용 설정 성공";

        PrivateClass privateClass = new PrivateClass();
//        privateClass.privateStatus = "내부 설정 성공"; // 뭔 짓을 해도 내부 변수는 바로 접근 불가 메소드를 통해 접근 가능

        DefaultClass defaultClass = new DefaultClass();
//        defaultClass.defaultClass = "기본 설정 성공"; // 같은 패키지 내에서만 접근이 가능
    }
}
