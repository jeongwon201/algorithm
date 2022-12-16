package com.baekjoon.step.step3;
// 9. 별 찍기 - 2

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem9 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());

        for (int i = 1; i <= num; i++) {
            for (int j = num; j > 0; j--) {
                if (j <= i) {
                    bw.write("*");
                } else {
                    bw.write(" ");
                }
            }

            bw.write("\n");
        }

        bw.flush();
        bw.close();
    }
}
