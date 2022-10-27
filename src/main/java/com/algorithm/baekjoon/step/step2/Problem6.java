package com.algorithm.baekjoon.step.step2;
// 6. 오븐 시계

import java.io.*;
import java.util.StringTokenizer;

public class Problem6 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int h = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int t = Integer.parseInt(br.readLine());

            int h2 = m + t >= 60 ? (h + ((m + t) / 60) >= 24 ? (h + ((m + t) / 60)) % 24 : h + ((m + t) / 60)) : h;
            int m2 = m + t >= 60 ? ((m + t) % 60) : m + t;

            bw.write(h2 + " " + m2);
            bw.flush();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}