package com.baekjoon.step.step10;
// 12. 좌표 압축

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Problem12 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int[] sorted = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());

            arr[i] = num;
            sorted[i] = num;
        }

        Arrays.sort(sorted);

        Map<Integer, Integer> map = new HashMap<>();

        int rank = 0;
        for (int num : sorted) {
            if (!map.containsKey(num)) {
                map.put(num, rank);
                rank++;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int num : arr) {
            sb.append(map.get(num) + " ");
        }

        System.out.println(sb);
    }
}

// 좌표 압축 알고리즘을 알고 있어야 한다.
// 좌표 압축 알고리즘이란, 무수히 많은 좌표에 대해 인덱스(순위)를 적용해
// 범위를 압축하는 알고리즘을 말한다.
// 중요한 점은 중복을 제거해야만 한다.