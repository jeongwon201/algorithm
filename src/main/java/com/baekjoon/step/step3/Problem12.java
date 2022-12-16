package com.baekjoon.step.step3;
// 12. 더하기 싸이클

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem12 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        int cnt = 0;
        int newNum = num;

        do {
            cnt++;
            int a, b;
            if(newNum < 10) {
                a = 0;
                b = newNum;
            } else {
                a = newNum / 10;
                b = newNum % 10;
            }

            newNum = ((a + b) % 10) + (b * 10);
        } while(num != newNum);

        bw.write(String.valueOf(cnt));
        bw.flush();
        bw.close();
    }
}