package com.algorithm.baekjoon.step.step2;
// 2. 시험 성적

import java.io.*;

public class Problem2 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            int score = Integer.parseInt(br.readLine());

            if(score <= 100 && score >= 90) {
                bw.write("A");
            } else if (score <= 89 && score >= 80) {
                bw.write("B");
            }
            else if(score <= 79 && score >= 70) {
                bw.write("C");
            }
            else if(score <= 69 && score >= 60) {
                bw.write("D");
            }
            else {
                bw.write("F");
            }

            bw.flush();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}