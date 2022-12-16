package com.baekjoon.step.step7;
// 6. 부녀회장이 될테야

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem6 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());


        for (int i = 0; i < t; i++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());

            int[][] apart = new int[k + 1][n + 1];

            for (int a = 1; a <= n; a++) {
                apart[0][a] = a;
            }

            for (int a = 1; a <= k; a++) {
                apart[a][1] = 1;
            }

            for (int a = 1; a <= k; a++) {
                for (int b = 2; b <= n; b++) {
                    int sum = 0;

                    for (int c = 1; c <= b; c++) {
                        sum += apart[a - 1][c];
                    }

                    apart[a][b] = sum;
                }
            }

            bw.write(apart[k][n] + "\n");
        }

        bw.flush();
        bw.close();
    }
}
