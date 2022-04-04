package leetcode.editor.cn;

import java.util.Scanner;

/**
 * @Author: ming
 * @Date: 2022/4/4 0:12
 */
public class Hj004 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int temp = 0;
        for (int i = 0; i < s.length(); ) {
            if (i <= s.length() - 8) {
                System.out.println(s.substring(i, i + 8));
                i = i + 8;
            } else {
                System.out.print(s.substring(i, s.length()));
                for (int j = 0; j < 8-(s.length() - i); j++) {
                    System.out.print("0");
                }
                i=i+8;
            }
        }

    }
}
