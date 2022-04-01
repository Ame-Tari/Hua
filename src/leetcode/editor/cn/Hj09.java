package leetcode.editor.cn;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @Author: ming
 * @Date: 2022/3/31 20:01
 */
public class Hj09 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        HashMap<String, String> map = new HashMap<>();
//        for (int i = s.length(); i > 0; i--) {
//            if (map.containsKey(String.valueOf(s.charAt(i)))) {
//                continue;
//            }else {
//                map.put(String.valueOf(s.charAt(i)),String.valueOf(s.charAt(i)) );
//                sb.append(String.valueOf(s.charAt(i)));
//            }
//        }
//        System.out.println(sb.toString());

        String result = "";
        for (int i = s.length(); i > 0; i--) {
            if (!result.contains(s.substring(i - 1, i))) {
                result += s.substring(i - 1, i);
            }
        }
        System.out.println(result);
    }
}
