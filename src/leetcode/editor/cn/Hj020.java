package leetcode.editor.cn;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * @Author: ming
 * @Date: 2022/4/4 17:50
 */
public class Hj020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            Pattern compile = Pattern.compile("[0-9]");
            compile.matcher(s).find();
            if (s.length() > 8) {
                int i = 0;
                if (s.matches("[0-9][a-z][A-Z]{2,3}") && !s.contains(" ") && !s.contains("/n")) {
                    while (s.substring(i, i + 3).equals("")) {

                    }
                }
            }


        }
    }
}
