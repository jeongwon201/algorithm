package com.baekjoon.step.step8;
// 1. 소수 찾기

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem1 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(st.nextToken());

            if (a != 1) {
                boolean isPrime = true;

                for (int j = 2; j < a; j++) {
                    if (a % j == 0) {
                        isPrime = false;
                        break;
                    }
                }

                if (isPrime == true) {
                    cnt++;
                }
            }
        }

        bw.write(String.valueOf(cnt));
        bw.flush();
        bw.close();
    }
}
