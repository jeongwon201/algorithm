package com.baekjoon.step.step7;
// 3. 분수 찾기

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem3 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int cnt = 1;
        int numerator = 1, denominator = 1, range = 1, idx = 1;

        while(cnt < n) {
            if(range == idx) {
                if((numerator + denominator) % 2 == 0) {
                    numerator = 1;
                    denominator++;
                } else {
                    numerator++;
                    denominator = 1;
                }
                idx = 1;
                range ++;
            } else {
                if((numerator + denominator) % 2 == 0) {
                    numerator--;
                    denominator++;
                } else {
                    numerator++;
                    denominator--;
                }

                idx++;
            }

            cnt++;
        }

        bw.write("res : " + numerator + "/" + denominator);
        bw.flush();
        bw.close();
    }
}

// while 문은 현재 값이 아닌 다음 값을 계산하는 로직!!!!!!!!!!!