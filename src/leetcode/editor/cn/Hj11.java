package leetcode.editor.cn;

import java.util.Scanner;

/**
 * @Author: ming
 * @Date: 2022/3/31 20:50
 */
public class Hj11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String result = new String();
        for (int i = s.length(); i > 0; i--) {
            result += s.substring(i - 1, i);
        }
        System.out.println(result);
    }


}
