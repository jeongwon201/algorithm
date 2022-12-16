package com.baekjoon.step.step4;
// 3. 최소, 최대

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem3 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int[] numbers = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }

        int max = numbers[0], min = numbers[0];
        for(int i=1; i<numbers.length; i++) {
            if(max < numbers[i]) {
                max = numbers[i];
            }

            if(min > numbers[i]) {
                min = numbers[i];
            }
        }

        bw.write(min + " " + max);
        bw.flush();
        bw.close();
    }
}
