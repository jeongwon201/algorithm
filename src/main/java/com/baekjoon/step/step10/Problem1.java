package com.baekjoon.step.step10;
// 1. 수 정렬하기

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Problem1 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int[] x = new int[n];

        for(int i=0; i<n; i++) {
            int a = Integer.parseInt(br.readLine());

            x[i] = a;
        }

        Arrays.sort(x);

        for(int i=0; i<x.length; i++) {
            bw.write(x[i] + "\n");
        }

        bw.flush();
        bw.close();
    }
}
