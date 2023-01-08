package com.baekjoon.step.step08;
// 2. 소수

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem2 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        int min = b, sum = 0;

        if (a == 1) {
            a++;
        }

        for (int i = a; i <= b; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime == true) {
                if (i < min) {
                    min = i;
                }

                sum += i;
            }
        }

        if (sum == 0) {
            bw.write(String.valueOf(-1));
        } else {
            bw.write(sum + "\n");
            bw.write(String.valueOf(min));
        }
        bw.flush();
        bw.close();
    }
}