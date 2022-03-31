package leetcode.editor.cn;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @Author: ming
 * @Date: 2022/3/31 19:29
 */
public class Hj08 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < num; i++) {
            int left = sc.nextInt();
            int right = sc.nextInt();
            if (map.containsKey(left)) {
                map.put(left ,map.get(left) + right);
            }else {
                map.put(left, right);
            }
        }
        for (Integer key : map.keySet()) {
            System.out.println(key + " " +map.get(key));
        }
    }


}

