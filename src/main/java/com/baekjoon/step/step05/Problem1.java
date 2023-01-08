package com.baekjoon.step.step05;
// 정수 N개의 합

public class Problem1 {
    long sum(int[] a) {
        long ans = 0;
        for(int i=0; i<a.length; i++) {
            ans += a[i];
        }
        return ans;
    }
}
