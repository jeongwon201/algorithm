package com.baekjoon.step.step10;
// 4. 수 정렬하기 2

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem4 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        sort(arr);

        for (int i = 0; i < arr.length; i++) {
            bw.write(arr[i] + "\n");
        }

        bw.flush();
        bw.close();
    }

    static void sort(int[] arr) {
        for (int i = ((arr.length - 1) - 1) / 2; i >= 0; i--) {
            heapify(arr, i, arr.length - 1);
        }

        for (int idx = arr.length - 1; idx > 0; idx--) {
            swap(arr, 0, idx);
            heapify(arr, 0, idx - 1);
        }
    }

    static void heapify(int[] arr, int parent, int last) {
        int left, right, big;

        while ((parent * 2) + 1 <= last) {
            left = (parent * 2) + 1;
            right = (parent * 2) + 2;
            big = parent;

            if (arr[left] > arr[big]) {
                big = left;
            }

            if (right <= last && arr[right] > arr[big]) {
                big = right;
            }

            if (big != parent) {
                swap(arr, parent, big);
                parent = big;
            } else {
                return;
            }
        }
    }

    static void swap(int[] arr, int a, int b) {
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }
}