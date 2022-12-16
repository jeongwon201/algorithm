package com.baekjoon.step.step10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Problem3 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int total = Integer.parseInt(st.nextToken());
        int cut = Integer.parseInt(st.nextToken());


        st = new StringTokenizer(br.readLine());

        int[] x = new int[total];
        for (int i = 0; i < total; i++) {
            x[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(x);

        bw.write(String.valueOf(x[total - cut]));
        bw.flush();
        bw.close();
    }
}