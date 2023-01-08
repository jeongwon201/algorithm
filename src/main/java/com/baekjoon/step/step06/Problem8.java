package com.baekjoon.step.step06;
// 8. 다이얼

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem8 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] n = new int[26];

        int dial = 2;
        int cnt = 3;
        for (int i = 0; i < n.length; i++) {
            if(cnt == 0) {
                if (dial == 6 || dial == 8) {
                    cnt = 4;
                } else {
                    cnt = 3;
                }
                dial++;
            }

            n[i] = dial;
            cnt--;
        }

        String s = br.readLine();
        int ans = 0;
        for(int i=0; i<s.length(); i++) {
            ans += n[s.charAt(i) - 65] + 1;
        }

        bw.write(String.valueOf(ans));

        bw.flush();
        bw.close();
    }
}
