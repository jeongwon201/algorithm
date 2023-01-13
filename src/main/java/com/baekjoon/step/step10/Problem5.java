package com.baekjoon.step.step10;
// 5. 수 정렬하기 3

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem5 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = new int[10001];
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            arr[Integer.parseInt(br.readLine())]++;
        }

        for (int i = 0; i < arr.length; i++) {
            while (arr[i]-- > 0) {
                bw.write(i + "\n");
            }
        }

        bw.flush();
        bw.close();
    }
}
