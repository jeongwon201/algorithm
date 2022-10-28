package com.algorithm.baekjoon.step.step3;
// 11. A + B - 4

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem11 {
    public static void main(String[] args) throws Exception  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = "";

        while((input = br.readLine()) != null) {
            String[] numbers = input.split(" ");
            int a = Integer.parseInt(numbers[0]);
            int b = Integer.parseInt(numbers[1]);

            bw.write(a + b + "\n");
        }

        bw.flush();
        bw.close();
    }
}

// 인텔리제이에서는 EOF 명령이 Ctrl + D 이다.