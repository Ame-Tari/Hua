package leetcode.editor.cn;

import javax.print.attribute.standard.PDLOverrideSupported;
import java.util.Scanner;

/**
 * @Author: ming
 * @Date: 2022/4/4 1:45
 */
public class Hj011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder(s);
        StringBuilder reverse = sb.reverse();
        System.out.println(reverse.toString());
    }
}
