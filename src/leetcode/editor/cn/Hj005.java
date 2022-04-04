package leetcode.editor.cn;

import java.util.Scanner;

/**
 * @Author: ming
 * @Date: 2022/4/4 0:47
 */
public class Hj005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String substring = s.substring(2, s.length());
        Double integer = new Double("0");
        int temp = 0;
        for (int i = substring.length(); i >0; i--) {
            integer += Math.pow(16, temp) * num(substring.substring(i - 1, i));
            temp++;
        }
        System.out.println(integer.intValue());
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
