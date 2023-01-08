package com.baekjoon.step.step08;
// 6. 골드바흐의 추측

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem6 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        for (int z = 0; z < t; z++) {
            int n = Integer.parseInt(br.readLine());
            
            boolean[] prime = new boolean[n + 1];
            prime[0] = prime[1] = true;

            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (prime[i] == true) continue;

                for (int j = i * i; j < prime.length; j = j + i) {
                    prime[j] = true;
                }
            }

            int a = n/2;
            int b = n/2;

            while(true) {
                if (prime[a] == false && prime[b] == false) {
                    bw.write(a + " " + b + "\n");
                    break;
                }

                a--;
                b++;
            }
        }

        bw.flush();
        bw.close();
    }
}

// 에라토스테네스의 체를 구현하여 소수를 선별하여 풀어보세요