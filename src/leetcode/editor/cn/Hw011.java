package leetcode.editor.cn;

import javax.swing.plaf.synth.ColorType;
import java.util.Scanner;

/**
 * @Author: ming
 * @Date: 2022/4/1 0:37
 */
public class Hw011 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = 0;
        while (sc.hasNextInt()) {
            int left = sc.nextInt();
            while (left != 2 && left > 2) {
                int temp = left % 3;
                result += left / 3;
                left = left / 3 + temp;
            }
            if (left == 2) {
                result += 1;
            }
            System.out.println(result);
        }
        result = 0;
    }
}
