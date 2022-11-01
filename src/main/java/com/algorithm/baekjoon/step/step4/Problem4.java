package com.algorithm.baekjoon.step.step4;
// 4. 최댓값

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem4 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] num = new int[9];
        for (int i = 0; i < 9; i++) {
            num[i] = Integer.parseInt(br.readLine());
        }

        int max = num[0], idx = 1;
        for (int i = 0; i < 9; i++) {
            if (max < num[i]) {
                max = num[i];
                idx = i + 1;
            }
        }

        bw.write(max + "\n");
        bw.write(idx + "\n");
        bw.flush();
        bw.close();
    }
}
