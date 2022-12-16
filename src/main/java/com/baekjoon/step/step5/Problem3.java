package com.baekjoon.step.step5;
// 3. 한수

import java.io.*;

public class Problem3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        bw.write(count(n) + "\n");
        bw.flush();
        bw.close();
    }

    private static int count(int n) {
        int cnt = 0;

        if(n<100) {
            return n;
        } else {
            cnt = 99;

            for(int i=100; i<=n; i++) {

                int a = i / 100;
                int b = (i / 10) % 10;
                int c = i % 10;

                if(b-a == c-b) {
                    cnt++;
                }
            }
        }
        return cnt;
    }
}

// 1 ~ 99는 모두 등차 수열이다.
// 이를 활용해서 한 수의 개수를 구하면 된다.
