package leetcode.editor.cn;

import java.util.Scanner;

/**
 * @Author: ming
 * @Date: 2022/4/3 23:52
 */
public class Hj {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int len = 0;
        for (int i = s.length(); i > 0; i--) {
            String substring = s.substring(i - 1, i);
            if (!substring.equals(" ")) {
                len++;
            }else {
                break;
            }
        }
        System.out.println(len);

    }
}
