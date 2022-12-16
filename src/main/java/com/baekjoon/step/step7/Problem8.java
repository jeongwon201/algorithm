package com.baekjoon.step.step7;
// 큰 수 A + B

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Problem8 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        BigInteger a = new BigInteger(st.nextToken());
        BigInteger b = new BigInteger(st.nextToken());

        bw.write(String.valueOf(a.add(b)));
        bw.flush();
        bw.close();
    }
}

// 자바의 BigInteger 클래스를 이용하거나, 배열에 저장하여 계산하는 두 가지 방법이 있다.