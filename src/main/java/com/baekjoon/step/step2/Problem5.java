package com.baekjoon.step.step2;
// 5. 알람 시계

import java.io.*;
import java.util.StringTokenizer;

public class Problem5 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int h = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            if(m - 45 < 0) {
                if(h - 1 < 0) {
                    h = 23;
                    m = 60 - (45 - m);
                } else {
                    --h;
                    m = 60 - (45 - m);
                }
            } else {
                m = m - 45;
            }

            bw.write(h + " " + m);

            bw.flush();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
