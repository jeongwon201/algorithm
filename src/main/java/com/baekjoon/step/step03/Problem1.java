package com.baekjoon.step.step03;
// 1. 구구단

import java.io.*;

public class Problem1 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            int a = Integer.parseInt(br.readLine());

            for(int i = 1; i<10; i++) {
                bw.write(a + " * " + i + " = ");
                bw.write(a * i +  "\n");
            }

            bw.flush();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
