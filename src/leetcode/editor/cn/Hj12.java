package leetcode.editor.cn;

import java.util.Scanner;

/**
 * @Author: ming
 * @Date: 2022/3/31 20:50
 */
public class Hj12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String result = new String();
        if (!s.contains(" ")) {
            System.out.println(s);
        }else {
            int temp = s.length();
            for (int i = s.length(); i > 0; i--) {
                String s1 = String.valueOf(s.charAt(i-1));
                if (s1.equals(" ")) {
                    result += s.substring(i, temp);
                    result += " ";
                    temp = i-1;
                }
            }

            result += s.substring(0, temp);
            System.out.println(result);
        }
    }

}
