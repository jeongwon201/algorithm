package com.baekjoon.step.step10;
// 7. 소트 인사이드

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;

public class Problem7 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        String str = String.valueOf(n);
        Integer[] arr = new Integer[str.length()];

        for(int i = 0; i<arr.length; i++) {
            arr[i] = str.charAt(i) - 48;
        }

        Arrays.sort(arr, Collections.reverseOrder());

        for(int i=0; i<arr.length; i++) {
            bw.write(String.valueOf(arr[i]));
        }

        bw.flush();
        bw.close();
    }
}
