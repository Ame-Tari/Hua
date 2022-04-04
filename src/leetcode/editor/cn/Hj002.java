package leetcode.editor.cn;

import java.util.Scanner;

/**
 * @Author: ming
 * @Date: 2022/4/3 23:59
 */
public class Hj002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toLowerCase();;
        String s1 = sc.nextLine().toLowerCase();
        int len = 0;
        for (int i = 1; i <= s.length(); i++) {
            String substring = s.substring(i-1, i);
            if (substring.equals(s1)) {
                len++;
            }
        }
        System.out.println(len);
    }
}
