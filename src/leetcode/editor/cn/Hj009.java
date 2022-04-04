package leetcode.editor.cn;

import java.util.*;

/**
 * @Author: ming
 * @Date: 2022/4/4 1:32
 */
public class Hj009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i =  s.length(); i >0; i--) {
            if (list.contains(Integer.valueOf(s.substring(i - 1, i)))) {
                continue;
            } else {
                list.add(Integer.valueOf(s.substring(i - 1, i)));
            }

        }
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
        }
    }
}
