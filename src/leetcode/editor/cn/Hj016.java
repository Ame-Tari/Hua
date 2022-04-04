package leetcode.editor.cn;

import java.util.Scanner;

/**
 * @Author: ming
 * @Date: 2022/4/4 2:37
 */
public class Hj016 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer yu = sc.nextInt();
        Integer num = sc.nextInt();
        Integer[][] ints = new Integer[num][3];
        int max = 0;
        int len = 0;
        sc.nextLine();
        while (len < 5) {
            String[] s = sc.nextLine().split(" ");
            ints[len][0] = Integer.valueOf(s[0]);
            ints[len][1] = Integer.valueOf(s[1]);
            ints[len][2] = Integer.valueOf(s[2]);
            len++;
        }
        int temp = 0;
        for (int i = 0; i < num; i++) {
            int coin = 0;
            temp = Math.max(max,temp);
            max = 0;
            if (ints[i][0] < yu && ints[i][2].equals(0)) {
                coin = yu - ints[i][0];
                max += ints[i][0] * ints[i][1];
                for (int j = num - 1; j > 1; j--) {
                    if (coin > ints[j][0] && !ints[j][2].equals(0) && ints[j - 1][0] == ints[j][0] && ints[j - 1][1] > ints[j][1]) {
                        j--;
                    } else if (coin > ints[j][0] && !ints[j][2].equals(0)) {

                    }
                    coin -= ints[j][0];
                    max = Math.max(max, max + ints[j][0] * ints[j][1]);
                }
            }
        }
        System.out.println(temp);
    }
}
