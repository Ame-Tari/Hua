package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @Author: ming
 * @Date: 2022/3/31 17:56
 */
public class Hj06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        ArrayList<String> list = new ArrayList<>();
        for (Integer j = 2; j <= i; j++) {
            while (i % j == 0) {
                list.add(j.toString());
                i = i / j;
            }
        }
        for (int j = 0; j < list.size(); j++) {
            System.out.print(list.get(j));
            System.out.print(" ");
        }


    }
}
