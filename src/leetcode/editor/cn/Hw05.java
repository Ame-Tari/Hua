package leetcode.editor.cn;

import javax.swing.*;
import java.util.Scanner;

/**
 * @Author: ming
 * @Date: 2022/3/31 16:39
 */
public class Hw05 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int num1 = 1;
        int temp = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            String s1 = String.valueOf(s.charAt(i));
            temp = (int) (num(s1) * Math.pow(16, i - 1));
            num1 = num1 * temp;
        }

        System.out.println(num1);

    }


    public static Integer num(String s) {
        switch (s) {
            case "1":
                return 1;
            case "2":
                return 2;
            case "3":
                return 3;
            case "4":
                return 4;
            case "5":
                return 5;
            case "6":
                return 6;
            case "7":
                return 7;
            case "8":
                return 8;
            case "9":
                return 9;
            case "A":
                return 10;
            case "B":
                return 11;
            case "C":
                return 12;
            case "D":
                return 13;
            case "E":
                return 14;
            case "F":
                return 15;
        }
        return 0;
    }
}

