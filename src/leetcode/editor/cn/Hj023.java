package leetcode.editor.cn;

import jdk.internal.org.objectweb.asm.tree.MethodInsnNode;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @Author: ming
 * @Date: 2022/4/4 19:33
 */
public class Hj023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        HashMap<String, Integer> map = new HashMap<>();
        int min = 1;
        for (int m = s.length(); m > 0; m--) {
            if (map.containsKey(s.substring(m - 1, m))) {
                map.put(s.substring(m - 1, m), map.get(s.substring(m - 1, m)) + 1);
                min = Math.min(map.get(s.substring(m - 1, m)), min);
            } else {
                map.put(s.substring(m - 1, m), 1);
                min = Math.min(1, min);
            }
        }
        for (String key : map.keySet()) {
            if (map.get(key).equals(min)) {
                s = s.replaceAll(key, "");
            }
        }
        System.out.println(s);

    }
}
