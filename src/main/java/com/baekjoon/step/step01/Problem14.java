package com.baekjoon.step.step01;
// 14. 새싹

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Problem14 {
    public static void main(String[] args) {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            bw.write("         ,r'\"7\n");
            bw.write("r`-_   ,'  ,/\n");
            bw.write(" \\. \". L_r'\n");
            bw.write("   `~\\/\n");
            bw.write("      |\n");
            bw.write("      |\n");

            bw.flush();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
