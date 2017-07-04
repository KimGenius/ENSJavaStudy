package com.rinc.basics;

import java.util.Scanner;

/**
 * Created by young on 2017-07-04.
 */
public class S_ScannerExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String str = scanner.next();
            if (str.equals("그만")) {
                System.out.println("안녕히가세요");
                break;
            } else {
                System.out.println(str);
            }
        }
    }
}

