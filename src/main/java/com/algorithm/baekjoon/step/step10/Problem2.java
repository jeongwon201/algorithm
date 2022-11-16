package com.algorithm.baekjoon.step.step10;
// 2. 대표값 2

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Problem2 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] x = new int[5];
        int sum = 0;

        for (int i = 0; i < 5; i++) {
            int a = Integer.parseInt(br.readLine());
            x[i] = a;
            sum += a;
        }

        Arrays.sort(x);

        bw.write(sum / 5 + "\n");
        bw.write(String.valueOf(x[2]));
        bw.flush();
        bw.close();
    }
}
