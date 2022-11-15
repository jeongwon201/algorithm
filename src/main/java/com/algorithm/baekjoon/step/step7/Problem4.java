package com.algorithm.baekjoon.step.step7;
// 4. 달팽이는 올라가고 싶다

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem4 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());

        if((v - b) % (a - b) == 0) {
            bw.write(String.valueOf((v - b) / (a - b)));
        } else {
            bw.write(String.valueOf((v - b) / (a - b) + 1));
        }
        bw.flush();
        bw.close();
    }
}
