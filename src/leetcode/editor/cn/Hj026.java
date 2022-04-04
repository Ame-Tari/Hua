package leetcode.editor.cn;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
/**
 * @Description 字符串排序
 * @Author haixiaofei
 * @Date 2022/2/15 9:20
 **/
public class Hj026 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BigInteger bigInteger = new BigInteger("100");
        System.out.println(bigInteger);

        while (input.hasNextLine()){
            String str = input.nextLine();
            str = sort(str);
            System.out.println(str);
        }
    }

    public static String sort(String str) {
        List<Character> characters = new ArrayList<>();
        for (char ch : str.toCharArray()){
            if (Character.isLetter(ch)) {
                characters.add(ch);
            }
        }
        //将英文字母先排序好,charactors并没有被修改
        characters.sort(Comparator.comparingInt(Character::toLowerCase));
        //若是非英文字母则直接添加
        StringBuilder result = new StringBuilder();
        for (int i = 0, j = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))) {
                result.append(characters.get(j++));
            }
            else {
                result.append(str.charAt(i));
            }
        }
        return result.toString();
    }
}