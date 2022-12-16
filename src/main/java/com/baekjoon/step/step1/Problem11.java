package com.baekjoon.step.step1;
// 11. 곱셈

import java.io.*;

public class Problem11 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            int a = Integer.parseInt(br.readLine());
            int b = Integer.parseInt(br.readLine());
            int b1 = b / 100, b2 = (b % 100) / 10 , b3 = ((b % 100) % 10);

            bw.write(a * b3 + "\n");
            bw.write(a * b2 + "\n");
            bw.write(a * b1 + "\n");
            bw.write(String.valueOf(a * b));

            bw.flush();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
