package com.baekjoon.step.step6;
//4. 문자열 반복

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem4 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for(int i=0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken());
            String s = st.nextToken();

            for(int j=0; j<s.length(); j++) {
                for(int k=0; k<r; k++) {
                    char c = s.charAt(j);
                    bw.write(c);
                }
            }
            bw.write("\n");
        }

        bw.flush();
        bw.close();
    }
}
