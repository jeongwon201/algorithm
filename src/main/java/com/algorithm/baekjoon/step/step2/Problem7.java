package com.algorithm.baekjoon.step.step2;
//  7. 주사위 세개

import java.io.*;
import java.util.StringTokenizer;

public class Problem7 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            int reward;
            if(a == b) {
                if(a == c) {
                    reward = 10000 + a * 1000;
                } else {
                    reward = 1000 + a * 100;
                }
            } else if(a == c) {
                reward = 1000 + a * 100;
            } else if(b == c) {
                reward = 1000 + b * 100;
            } else {
                if(a > b) {
                    if(a > c) {
                        reward = a * 100;
                    } else {
                        reward = c * 100;
                    }
                } else {
                    if(b > c) {
                        reward = b * 100;
                    } else {
                        reward = c * 100;
                    }
                }
            }

            bw.write(String.valueOf(reward));
            bw.flush();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
