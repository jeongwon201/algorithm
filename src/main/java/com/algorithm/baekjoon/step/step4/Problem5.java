package com.algorithm.baekjoon.step.step4;
// 5. 과제 안 내신 분..?

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem5 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] student = new int[31];
        for (int i = 1; i <= 28; i++) {
            student[Integer.parseInt(br.readLine())] = 1;
        }

        for (int i = 1; i<= 30; i++) {
            if(student[i] != 1) bw.write(i + "\n");
        }

        bw.flush();
        bw.close();
    }
}

// 입력받은 학생의 번호를 값이 아닌 index 로 활용한다면 쉽게 풀 수 있는 문제였다...