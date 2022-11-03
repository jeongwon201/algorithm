package com.algorithm.baekjoon.step.step8;
// 3. 색종이

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

        int[][] white = new int[100][100];

        for(int i=0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            for(int j=0; j<st.countTokens(); j++) {
                int a = Integer.parseInt(st.nextToken()) - 1;
                int b = Integer.parseInt(st.nextToken()) - 1;

                for(int k=b; k<b+10; k++) {
                    for(int l=a; l<a+10; l++) {
                        white[k][l] = 1;
                    }
                }
            }
        }

        int res = 0;
        for(int i=0; i<100; i++) {
            for(int j=0; j<100; j++) {
                if(white[i][j] == 1) {
                    res++;
                }
            }
        }

        bw.write(res + "\n");
        bw.flush();
        bw.close();
    }
}

// StringTokenizer 는 더 이상 값이 없을 때 NoSuchElementException 예외를 던진다.
// EOF 또는 null 을 반환하는게 아니므로, countTokens() 메서드를 활용하자.