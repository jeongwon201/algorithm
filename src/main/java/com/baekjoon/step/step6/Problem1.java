package com.baekjoon.step.step6;
// 1. 아스키 코드

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem1 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        char c = s.charAt(0);
        bw.write((int)c + "\n");

        bw.flush();
        bw.close();
    }
}

// 아스키 코드 변환은 int 형변환하면 된다.