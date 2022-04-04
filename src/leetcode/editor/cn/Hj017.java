package leetcode.editor.cn;

import java.util.Scanner;
import java.util.UnknownFormatConversionException;

/**
 * @Author: ming
 * @Date: 2022/4/4 15:58
 */
public class Hj017 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String ss = sc.nextLine();
        String[] split = s.split(";");
        int left = 0, right = 0;
        for (int i = 0; i < split.length; i++) {
            String substring = "";
            if (split[i].length() > 1) {
                substring = split[i].substring(0, 1);
            } else {
                continue;
            }
            if ("ASWD".contains(substring)) {
                String substring1 = split[i].substring(1, split[i].length());
                if (substring1.matches("[0-9]{1,2}")) {
                    if (substring.equals("A")) {
                        left -= Integer.valueOf(substring1);
                    } else if (substring.equals("S")) {
                        right -= Integer.valueOf(substring1);
                    } else if (substring.equals("D")) {
                        left += Integer.valueOf(substring1);
                    } else {
                        right += Integer.valueOf(substring1);
                    }
                } else {
                    continue;
                }
            }
            continue;
        }
        System.out.println("(" + left + "," + right + ")");
    }
}
