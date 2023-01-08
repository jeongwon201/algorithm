package com.baekjoon.step.step06;
// 3. 알파벳 찾기

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem3 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();

        for(int i='a'; i<='z'; i++) {
            bw.write(s.indexOf(i) + " ");
        }

        bw.flush();
        bw.close();
    }
}

// int 형에 char 형을 할당하면 아스키 코드로 변환되어 들어간다.