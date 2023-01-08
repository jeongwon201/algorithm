package com.baekjoon.step.step08;
//4. 소수 구하기

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

import static java.lang.Math.sqrt;

public class Problem4 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        if(a == 1) {
            a++;
        }

        for(int i=a; i<=b; i++) {
            boolean isPrime = true;

            for(int j=2; j<=sqrt(i); j++) {
                if(i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if(isPrime == true) {
                bw.write(i + "\n");
            }
        }

        bw.flush();
        bw.close();
    }
}
