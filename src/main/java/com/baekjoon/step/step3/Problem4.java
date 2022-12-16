package com.baekjoon.step.step3;
// 4. 영수증

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem4 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int receiptTotalPrice = Integer.parseInt(br.readLine());
        int num = Integer.parseInt(br.readLine());

        int totalPrice = 0;

        for(int i = 0; i < num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int itemPrice = Integer.parseInt(st.nextToken());
            int itemQuantity = Integer.parseInt(st.nextToken());

            totalPrice += itemPrice * itemQuantity;
        }

        bw.write(receiptTotalPrice == totalPrice ? "Yes" : "No");
        bw.flush();
        bw.close();
    }
}
