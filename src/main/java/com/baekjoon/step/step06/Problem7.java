package com.baekjoon.step.step06;
// 7. 상수

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem7 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        String a = st.nextToken();
        String b = st.nextToken();

        String a2 = "";
        String b2 = "";

        for (int i = 2; i >= 0; i--) {
            a2 += a.charAt(i);
            b2 += b.charAt(i);
        }

        if (Integer.parseInt(a2) > Integer.parseInt(b2)) {
            bw.write(a2);
        } else {
            bw.write(b2);
        }

        bw.flush();
        bw.close();
    }
}
