package com.baekjoon.step.step1;
// 8. 1998년생인 내가 태국에서는 2541년생?!

import java.io.*;

public class Problem8 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            int year = Integer.parseInt(br.readLine());

            bw.write(String.valueOf(year - 543));
            bw.flush();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
