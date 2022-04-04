package leetcode.editor.cn;

import java.util.Scanner;

/**
 * @Author: ming
 * @Date: 2022/4/4 1:39
 */
public class Hj010 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String temp = "";
        int len = 0;
        for (int i = 1; i <= s.length(); i++) {
            if (temp.contains(s.substring(i - 1, i))) {
                continue;
            } else {
                temp += s.substring(i - 1, i);
                len++;
            }
        }
        System.out.println(len);
    }
}
