//package leetcode.editor.cn;
//
//import java.util.ArrayList;
//import java.util.BitSet;
//import java.util.Scanner;
//
///**
// * @Author: ming
// * @Date: 2022/4/1 14:56
// */
//public class Hj26 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();
//        char[] chars = s.toCharArray();
//        Character min = 'A';
//        int length = s.length();
//        Character.getType(min);
//        StringBuilder sb = new StringBuilder();
//        while (sb.length()<length) {
//            for (int i = 0; i < length; i++) {
//                char temp = chars[i];
//                if (temp>= 'A' && temp <= 'Z') {
//                    min = Math.min();
//
//                } else if (temp- 32 >= 'A' && (temp - 32 <= 'Z')) {
//
//                    break;
//                } else {
//                    sb.append(temp);
//                }
//            }
//            s.replace(min, "");
//            sb.append(Character.getNumericValue());
//        }
//    }
//}
