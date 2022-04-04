package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * @Author: ming
 * @Date: 2022/4/1 14:12
 */
public class Hj23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        HashMap<Character, Integer> map = new HashMap<>();
        ArrayList<Character> list = new ArrayList<>();
        int min = 1;
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                list.add((s.charAt(i)));
                map.put(s.charAt(i) , map.get(s.charAt(i)+1));
                min = Math.min(min, map.get(s.charAt(i)));
            }
            else {
                list.add((s.charAt(i)));
                map.put((s.charAt(i)), 1);
                min = Math.min(min, map.get(s.charAt(i)));
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if (map.containsKey(list.get(i)) && map.get(list.get(i)) == min) {
                list.remove(map.get(list.get(i)));
            }
        }
        System.out.println(list.toString());


    }

}
