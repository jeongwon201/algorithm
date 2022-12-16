package com.baekjoon.step.step2;
// 4. 사분면 고르기

import java.io.*;

public class Problem4 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            int x = Integer.parseInt(br.readLine());
            int y = Integer.parseInt(br.readLine());

            if(x > 0 && y > 0) bw.write("1");
            if(x < 0 && y > 0) bw.write("2");
            if(x < 0 && y < 0) bw.write("3");
            if(x > 0 && y < 0) bw.write("4");

            bw.flush();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
