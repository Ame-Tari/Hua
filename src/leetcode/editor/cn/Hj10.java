package leetcode.editor.cn;

import java.util.Iterator;
import java.util.Scanner;

/**
 * @Author: ming
 * @Date: 2022/3/31 20:28
 */
public class Hj10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String result = new String();
        for (int i = s.length(); i > 0; i--) {
            String s1 = s.substring(i - 1, i);
            if (!result.contains(s1)) {
                result += s1;
            }
        }
        System.out.println(result.length());
    }
}
