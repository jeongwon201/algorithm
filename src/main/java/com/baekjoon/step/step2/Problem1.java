package com.baekjoon.step.step2;
// 1. 두 수 비교하기

import java.io.*;
import java.util.StringTokenizer;

public class Problem1 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if(a == b) bw.write("==");
            if(a > b) bw.write(">");
            if(a < b) bw.write("<");

            bw.flush();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
