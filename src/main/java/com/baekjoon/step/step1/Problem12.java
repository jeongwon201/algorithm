package com.baekjoon.step.step1;
// 12. 고양이

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Problem12 {
    public static void main(String[] args) {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            bw.write("\\    /\\\n");
            bw.write(" )  ( ')\n");
            bw.write("(  /  )\n");
            bw.write(" \\(__)|\n");

            bw.flush();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

// 자바에서 백슬래시를 출력하고 싶으면 \ 기호가 아닌 \\를 사용해야 한다.