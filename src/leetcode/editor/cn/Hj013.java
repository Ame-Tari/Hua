package leetcode.editor.cn;

import java.util.Scanner;

/**
 * @Author: ming
 * @Date: 2022/4/4 1:48
 */
public class Hj013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int temp = s.length();
        for (int i = s.length(); i > 0; i--) {
            if (s.substring(i - 1, i).equals(" ")) {
                System.out.print(s.substring(i, temp));
                System.out.print(" ");
                temp = i - 1;
            }
        }
        System.out.print(s.substring(0, temp));
    }
}
