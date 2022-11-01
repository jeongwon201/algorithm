package com.algorithm.baekjoon.step.step4;
// 8. OX퀴즈

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem8 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        String[] input = new String[num];

        for(int i=0; i<num; i++) {
            input[i] = br.readLine();

            char[] chars = input[i].toCharArray();
            int score = 0;
            int seq = 0;

            for(int j=0; j<chars.length; j++) {
                if(chars[j] == 'O') {
                    seq++;
                    score += seq;
                } else {
                    seq = 0;
                }
            }
            bw.write(score + "\n");
        }

        bw.flush();
        bw.close();
    }
}
