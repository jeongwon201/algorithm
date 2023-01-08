package com.baekjoon.step.step04;
// 9. 평균은 넘겠지

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem9 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int caseNum = Integer.parseInt(br.readLine());
        String[] testCase = new String[caseNum];

        for (int i = 0; i < caseNum; i++) {
            testCase[i] = br.readLine();
        }

        StringTokenizer st;

        for (int i = 0; i < testCase.length; i++) {
            st = new StringTokenizer(testCase[i]);

            int scoreNum = Integer.parseInt(st.nextToken());
            float[] score = new float[scoreNum];
            float total = 0;

            for (int j = 0; j < scoreNum; j++) {
                score[j] = Integer.parseInt(st.nextToken());
                total += score[j];
            }

            float average = total / scoreNum;
            int cnt = 0;
            for (int z = 0; z < scoreNum; z++) {
                if (score[z] > average) cnt++;
            }

            float percent = ((float) cnt / (float) scoreNum) * 100;
            bw.write(String.format("%.3f", percent) + "%\n");

        }

        bw.flush();
        bw.close();
    }
}
