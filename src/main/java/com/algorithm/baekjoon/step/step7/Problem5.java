package com.algorithm.baekjoon.step.step7;
// 5. ACM 호텔

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem5 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int h = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());

            int nh;

            if (n % h == 0) {
                nh = h;
            } else {
                nh = n % h;
            }

            int nw;

            if (n % h == 0) {
                nw = n / h;
            } else {
                nw = n / h + 1;
            }

            bw.write(nh + String.format("%02d", nw) + "\n");
        }

        bw.flush();
        bw.close();
    }
}
