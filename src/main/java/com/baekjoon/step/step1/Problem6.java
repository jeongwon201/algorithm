package com.baekjoon.step.step1;
// 6. 사직 연산

import java.io.*;
import java.util.StringTokenizer;

public class Problem6 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            bw.write(a + b + "\n");
            bw.write(a - b + "\n");
            bw.write(a * b + "\n");
            bw.write(a / b + "\n");
            bw.write(a % b + "\n");
            bw.flush();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
