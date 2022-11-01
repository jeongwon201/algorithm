package com.algorithm.baekjoon.step.step4;
// 7. 평균

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Problem7 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        int[] input = new int[num];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < num; i++) {
            input[i] = Integer.parseInt(st.nextToken());
        }

        int max = Arrays.stream(input).max().getAsInt();
        double res = 0;

        for (int i = 0; i < num; i++) {
            res += (((double) input[i] / (double) max) * 100);
        }

        bw.write(res / num + "\n");
        bw.flush();
        bw.close();
    }
}
