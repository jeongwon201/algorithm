package com.algorithm.baekjoon.step.step8;
// 5. 베르트랑 공준

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import static java.lang.Math.sqrt;

public class Problem5 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) break;

            int cnt = 0;

            for (int i = (n + 1); i <= (n * 2); i++) {
                boolean isPrime = true;

                for (int j = 2; j <= sqrt(i); j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }

                if(isPrime == true) cnt++;
            }

            bw.write(cnt + "\n");
        }

        bw.flush();
        bw.close();
    }
}
