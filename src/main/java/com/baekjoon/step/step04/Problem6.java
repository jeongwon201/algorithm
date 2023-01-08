package com.baekjoon.step.step04;
// 6. 나머지

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;

public class Problem6 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] input = new int[10];
        for(int i=0; i<10; i++) {
            input[i] = Integer.parseInt(br.readLine());
        }

        Set<Integer> res = new HashSet<>();
        for(int i=0; i<10; i++) {
            res.add(input[i] % 42);
        }

        bw.write(res.size() + "\n");
        bw.flush();
        bw.close();
    }
}
