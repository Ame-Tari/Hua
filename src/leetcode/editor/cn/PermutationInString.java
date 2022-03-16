//给你两个字符串 s1 和 s2 ，写一个函数来判断 s2 是否包含 s1 的排列。如果是，返回 true ；否则，返回 false 。 
//
// 换句话说，s1 的排列之一是 s2 的 子串 。 
//
// 
//
// 示例 1： 
//
// 
//输入：s1 = "ab" s2 = "eidbaooo"
//输出：true
//解释：s2 包含 s1 的排列之一 ("ba").
// 
//
// 示例 2： 
//
// 
//输入：s1= "ab" s2 = "eidboaoo"
//输出：false
// 
//
// 
//
// 提示： 
//
// 
// 1 <= s1.length, s2.length <= 10⁴ 
// s1 和 s2 仅包含小写字母 
// 
// Related Topics 哈希表 双指针 字符串 滑动窗口 👍 604 👎 0

package leetcode.editor.cn;

import java.util.HashMap;

//Java：字符串的排列
public class PermutationInString{
    public static void main(String[] args) {
        Solution solution = new PermutationInString().new Solution();
    }
    
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> temp = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            map.put(s1.charAt(i), i);
        }
        temp = map;
        int left = 0, right = 0;
        int num = 0;
        while (left < s2.length() && num < s2.length()) {
            while (map.containsKey(s2.charAt(num))) {
                while (map.containsKey(s2.charAt(num + 1))&&!map.isEmpty()) {
                    map.remove(s2.charAt(num));
                    num++;
                }
                if (map.containsKey(s2.charAt(num))) {
                    return true;
                }
                if (right < s2.length()) {
                    num = 0;
                    map = temp;
                    right++;
                    left = right;
                }else {
                    return false;
                }
            }
        }
        return false;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}