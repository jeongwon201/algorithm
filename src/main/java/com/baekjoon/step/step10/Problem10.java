package com.baekjoon.step.step10;
// 10. 단어 정렬

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Problem10 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = br.readLine();
        }

        Arrays.sort(arr, (e1, e2) -> {
            if (e1.length() == e2.length()) {
                return e1.compareTo(e2);
            } else {
                return e1.length() - e2.length();
            }
        });

        String tmp = "";
        for (int i = 0; i < n; i++) {
            if (!tmp.equals(arr[i])) {
                bw.write(arr[i] + "\n");
            }

            tmp = arr[i];
        }

        bw.flush();
        bw.close();
    }
}

// String의 compareTo 메서드를 알아야 쉽게 풀 수 있음