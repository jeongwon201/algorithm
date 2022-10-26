package com.algorithm.baekjoon.step.step1;
// 9. 킹, 퀸, 룩, 비숍, 나이트, 폰

import java.io.*;
import java.util.StringTokenizer;

public class Problem9 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            int king = 1, queen = 1, look = 2, bishop = 2, knight = 2, pawn = 8;

            StringTokenizer st = new StringTokenizer(br.readLine());
            bw.write(king - Integer.parseInt(st.nextToken()) + " ");
            bw.write(queen - Integer.parseInt(st.nextToken()) + " ");
            bw.write(look - Integer.parseInt(st.nextToken()) + " ");
            bw.write(bishop - Integer.parseInt(st.nextToken()) + " ");
            bw.write(knight - Integer.parseInt(st.nextToken()) + " ");
            bw.write(pawn - Integer.parseInt(st.nextToken()) + " ");

            bw.flush();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
