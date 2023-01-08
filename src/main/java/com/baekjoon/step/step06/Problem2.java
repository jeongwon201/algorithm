package com.baekjoon.step.step06;
// 2. 숫자의 합

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem2 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();

        int sum = 0;
        for(int i=0; i<s.length(); i++) {
            sum += Integer.parseInt(String.valueOf(s.charAt(i)));
        }

        bw.write(sum + " ");
        bw.flush();
        bw.close();
    }
}

// 아스키 코드로 변환 후 -48 해서 숫자로 바꾸는 방법도 있다.