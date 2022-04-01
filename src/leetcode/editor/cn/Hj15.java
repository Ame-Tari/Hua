package leetcode.editor.cn;

import java.util.Scanner;

/**
 * @Author: ming
 * @Date: 2022/3/31 22:05
 */
public class Hj15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer s = sc.nextInt();
        String s1 = new String();
        while (s != 0) {
            if (s % 2 == 0 && s != 0) {
                s1 += 0;
                s = (s / 2);
            }else if(s % 2 != 0 && s != 0) {
                s1 += 1;
                s = s / 2;
            } else if (s % 2 == 0 && s == 0) {
                s1 += 1;
            }
        }

        System.out.println(String.valueOf(s1).replaceAll("0","").length());
    }

}
