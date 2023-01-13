package com.baekjoon.step.step10;
// 6. 통계학

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem6 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int[] count = new int[8001];

        int sum = 0;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());
            arr[i] = num;
            count[num + 4000]++;
            sum += num;
        }

        Arrays.sort(arr);

        double avg = (double)sum / n;

        bw.write((int)Math.round(avg) + "\n");
        bw.write(arr[n / 2] + "\n");

        int max = 0;
        for (int i = 0; i < count.length; i++) {
            if (max < count[i]) {
                max = count[i];
            }
        }

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < count.length; i++) {
            if (count[i] == max) {
                list.add(i - 4000);
            }
        }

        if (list.size() > 1) {
            bw.write(list.get(1) + "\n");
        } else {
            bw.write(list.get(0) + "\n");
        }

        bw.write(String.valueOf(arr[n - 1] - arr[0]));

        bw.flush();
        bw.close();
    }
}
