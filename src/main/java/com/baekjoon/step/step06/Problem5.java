package com.baekjoon.step.step06;
// 5. 단어 공부

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem5 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine().toLowerCase();
        int[] n = new int[26];

        for(int i=0; i<s.length(); i++) {
            if(s.indexOf(s.charAt(i)) != -1) {
                n[s.charAt(i) - 97]++;
            }
        }

        int max = 0;
        char c = '?';

        for(int i=0; i<n.length; i++) {
            if(n[i] > max) {
                max = n[i];
                c = (char)(i + 65);
            } else if(n[i] == max) {
                c = '?';
            }
        }

        bw.write(c + "");
        bw.flush();
        bw.close();
    }
}

// 아스키 코드를 활용하자!
