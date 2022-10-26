package com.algorithm.baekjoon.step.step1;
// 10. 나머지

import java.io.*;
import java.util.StringTokenizer;

public class Problem10 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            bw.write((a + b) % c + "\n");
            bw.write(((a % c) + (b % c)) % c + "\n");
            bw.write((a * b) % c + "\n");
            bw.write(((a % c) * (b % c)) % c + "\n");

            bw.flush();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
