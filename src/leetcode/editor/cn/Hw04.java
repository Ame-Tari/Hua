package leetcode.editor.cn;
import java.util.*;
/**
 * @Author: ming
 * @Date: 2022/3/31 16:14
 */
public class Hw04 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int len =s.length();
        int temp = len%8;
        for(int i=0;i<len;){
            if(i<=len-8){
                System.out.println(s.substring(i,i+8));
                i=i+8;
            }else {
                System.out.print(s.substring(i,i+temp));
                for(int j=0;j<=7-temp;j++){
                    System.out.print("0");
                }
                i = i+8;
            }
        }
    }
}
