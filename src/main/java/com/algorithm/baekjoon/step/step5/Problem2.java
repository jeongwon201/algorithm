package com.algorithm.baekjoon.step.step5;
// 2. 셀프 넘버

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class Problem2 {
    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] seq = new int[10001];

        for(int i=1; i<=10000; i++) {
            int n = kaprekar(i);

            if(n<=10000) {
                seq[n] = 1;
            }
        }

        for(int i=1; i<=10000; i++) {
            if(seq[i] != 1) {
                bw.write(i + "\n");
            }
        }

        bw.flush();
        bw.close();
    }

    public static int kaprekar(int n) {
        int ans = n;
        while(n > 0) {
            ans += n % 10;
            n /= 10;
        }

        return ans;
    }
}

// 셀프 넘버의 이해가 필요하다.
// kaprekar 함수의 리턴값으로 출력되지 않는 수가 셀프 넘버이다.
// 리턴되어 출력되는 값은 모두 생성자가 존재한다.