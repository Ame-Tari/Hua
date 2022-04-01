package leetcode.editor.cn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @Author: ming
 * @Date: 2022/3/31 23:31
 */
public class Hj17 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s1 = br.readLine().split(";");
        int left = 0;
        int right = 0;
        for (String s : s1) {
            if (!s.matches("[WASD]][0-9]{1,2}")) {
                continue;
            }
            int val = Integer.valueOf(s.substring(1));
            switch (s.charAt(0)) {
                case 'W':
                    right += val;
                    break;
                case 'A':
                    left -= val;
                    break;
                case 'S':
                    right -= val;
                    break;
                case 'D':
                    left += val;
                    break;
            }
        }
        System.out.println(left+ ","+right);

    }
}
