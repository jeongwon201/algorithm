package com.algorithm.baekjoon.step.step1;
// 13. 개

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Problem13 {
    public static void main(String[] args) {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            bw.write("|\\_/|\n");
            bw.write("|q p|   /}\n");
            bw.write("( 0 )\"\"\"\\\n");
            bw.write("|\"^\"`    |\n");
            bw.write("||_/=\\\\__|\n");

            bw.flush();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

/*
12번 문제와 동일한 백슬래시와, 쌍따옴표가 있다.
쌍따옴표는 " 기호가 아닌 \" 기호로 사용해야 한다.
*/
