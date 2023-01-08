package com.baekjoon.step.step02;
// 3. 윤년

import java.io.*;

public class Problem3 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            int year = Integer.parseInt(br.readLine());

            if (year % 4 == 0) {
                if(year % 400 == 0 || year % 100 != 0) {
                    bw.write("1");
                } else {
                    bw.write("0");
                }
            } else {
                bw.write("0");
            }

            bw.flush();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}