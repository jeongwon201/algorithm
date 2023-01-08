package com.baekjoon.step.step03;
// 3. 합

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem3 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int res = 0;
        for(int i = 1; i <= n; i++) {
            res += i;
        }

        bw.write(String.valueOf(res));

        bw.flush();
        bw.close();
    }
}
