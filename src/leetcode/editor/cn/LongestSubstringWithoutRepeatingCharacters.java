//给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串 的长度。 
//
// 
//
// 示例 1: 
//
// 
//输入: s = "abcabcbb"
//输出: 3 
//解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
// 
//
// 示例 2: 
//
// 
//输入: s = "bbbbb"
//输出: 1
//解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
// 
//
// 示例 3: 
//
// 
//输入: s = "pwwkew"
//输出: 3
//解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
//     请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
// 
//
// 
//
// 提示： 
//
// 
// 0 <= s.length <= 5 * 10⁴ 
// s 由英文字母、数字、符号和空格组成 
// 
// Related Topics 哈希表 字符串 滑动窗口 👍 7113 👎 0

package leetcode.editor.cn;

import java.util.HashMap;

//Java：无重复字符的最长子串
public class LongestSubstringWithoutRepeatingCharacters{
    public static void main(String[] args) {
        Solution solution = new LongestSubstringWithoutRepeatingCharacters().new Solution();
        // TO TES
    }
    
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int lengthOfLongestSubstring(String s) {
            int ans = 0,num = 0;
            HashMap<Character, Integer> map = new HashMap<>();
            int left = 0,right = 0;
            while (left<s.length()) {
                if (!map.containsKey(s.charAt(left))) {
                    map.put(s.charAt(left), left);
                    left++;
                    num++;
                    ans = Math.max(ans, num);
                }else {
                    right++;
                    left = right;
                    map = new HashMap<>();
                    num = 0;
                }
            }
            return ans;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}