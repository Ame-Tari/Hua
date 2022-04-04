package leetcode.editor.cn;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author: ming
 * @Date: 2022/4/4 2:02
 */
public class Hj014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer i = Integer.valueOf(sc.nextLine());
        String[] strings = new String[i];
        int temp = 0;
        while (sc.hasNext()) {
            for (int j = 0; j < i; j++) {
                String s = sc.nextLine();
                strings[temp] = s;
                temp++;
            }
        }
        Arrays.sort(strings);
        for (int j = 0; j < i; j++) {
            System.out.println(strings[j]);
        }
    }
}
