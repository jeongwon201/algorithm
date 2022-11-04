package com.algorithm.baekjoon.step.step6;
// 9. 크로아티아 알파벳

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem9 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();

        int cnt = 0;

        s = s.replace("c=", "a");
        s = s.replace("c-", "a");
        s = s.replace("dz=", "a");
        s = s.replace("d-", "a");
        s = s.replace("lj", "a");
        s = s.replace("nj", "a");
        s = s.replace("s=", "a");
        s = s.replace("z=", "a");

        for(int i=0; i<s.length(); i++) {
            cnt++;
        }

        bw.write(String.valueOf(cnt));
        bw.flush();
        bw.close();
    }
}

// String 클래스의 replace 메서드를 활용하여 크로아티아 알파벳을 모두 a로 치환한다.