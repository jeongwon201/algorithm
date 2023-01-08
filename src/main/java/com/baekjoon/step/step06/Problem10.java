package com.baekjoon.step.step06;
// 10. 그룹 단어

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem10 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int ans = 0;

        for(int i=0; i<n; i++) {
            String s = br.readLine();
            int[] a = new int[26];
            boolean isGroup = true;

            char tmp = s.charAt(0);

            for(int j=0; j<s.length(); j++) {
                char c = s.charAt(j);

                if(tmp != c) {
                    if(a[c - 97] == 1) {
                        isGroup = false;
                        break;
                    }
                }

                a[c - 97] = 1;
                tmp = s.charAt(j);

                bw.write(isGroup + " ");
            }

            if(isGroup == true) ans++;

            bw.write("i: " + i + " ans: " + ans + "\n");
        }

        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
    }
}
