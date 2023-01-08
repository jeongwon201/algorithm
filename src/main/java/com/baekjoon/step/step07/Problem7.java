package com.baekjoon.step.step07;
// 7. 설탕 배달

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem7 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int kg = Integer.parseInt(br.readLine());
        int res;

        if(kg == 4 || kg == 7) {
            bw.write(String.valueOf(-1));
        } else if (kg % 5 == 0) {
            bw.write(String.valueOf(kg / 5));
        } else if(kg % 5 == 1 || kg % 5 == 3) {
            bw.write(String.valueOf((kg / 5) + 1));
        } else if(kg % 5 == 2 || kg % 5 == 4) {
            bw.write(String.valueOf((kg / 5) + 2));
        }

        bw.flush();
        bw.close();
    }
}

// 골드 바흐 추측: 두 소수의 합으로 표현 가능한 모든 정수는 모든 항이 1이 될 때 까지 원하는 만큼 얼마든지 많은 개수의 소수의 합으로 분해할 수 있다.
// 즉 3 + 5 = 8 이상의 정수 중 3과 5로 구성되지 않는 수는 0에 가깝다.
// 이를 활용해서 규칙성을 찾아 문제를 풀어보자