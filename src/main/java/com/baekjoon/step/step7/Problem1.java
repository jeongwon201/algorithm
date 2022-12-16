package com.baekjoon.step.step7;
// 1. 손익분기점

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem1 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        long a = Integer.parseInt(st.nextToken());
        long b = Integer.parseInt(st.nextToken());
        long c = Integer.parseInt(st.nextToken());

        long total = a;
        long breakEventPoint = 0;
        int cnt = 0;

        while(total >= breakEventPoint) {
            if(cnt > 2100000000) {
                cnt = -1;
                break;
            }

            total += b;
            breakEventPoint += c;
            cnt++;
        }

        bw.write(total + " " + breakEventPoint + "\n");

        bw.write(String.valueOf(cnt));
        bw.flush();
        bw.close();
    }
}
