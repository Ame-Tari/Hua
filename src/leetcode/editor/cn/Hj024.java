package leetcode.editor.cn;

import java.util.Scanner;

/**
 * @Author: ming
 * @Date: 2022/4/4 20:18
 */
public class Hj024 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        char[] chars = sc.nextLine().toCharArray();
        int max = 0;
        //以小博大，取所有点开始然后扩散
        int left = 0, right = 0;
        for (int i = 0; i < chars.length; i++) {
            int temp = Integer.valueOf(chars[i - 1]);
            int tt = Integer.valueOf(chars[i + 1]);
            if (left < temp) {
                left = temp;

            }
        }

    }
}
