package com.baekjoon.step.step08;
// 3. 소인수분해

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem3 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int divide = 2;

        while(n > 1) {
            if(n % divide == 0) {
                n /= divide;
                bw.write(divide + "\n");

                divide = 2;
            } else {
                divide++;
            }
        }
        bw.flush();
        bw.close();
    }
}
