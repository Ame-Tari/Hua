//给定一个字符串 s ，你需要反转字符串中每个单词的字符顺序，同时仍保留空格和单词的初始顺序。 
//
// 
//
// 示例 1： 
//
// 
//输入：s = "Let's take LeetCode contest"
//输出："s'teL ekat edoCteeL tsetnoc"
// 
//
// 示例 2: 
//
// 
//输入： s = "God Ding"
//输出："doG gniD"
// 
//
// 
//
// 提示： 
//
// 
// 1 <= s.length <= 5 * 10⁴ 
// s 包含可打印的 ASCII 字符。 
// s 不包含任何开头或结尾空格。 
// s 里 至少 有一个词。 
// s 中的所有单词都用一个空格隔开。 
// 
// Related Topics 双指针 字符串 👍 412 👎 0

package leetcode.editor.cn;
//Java：反转字符串中的单词 III
public class ReverseWordsInAStringIii{
    public static void main(String[] args) {
        Solution solution = new ReverseWordsInAStringIii().new Solution();
        // TO TEST
    }
    
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String reverseWords(String s) {
            char[] chs = s.toCharArray();
            int n = chs.length;
            int idx = 0;
            for(int i = 0; i < n; i++) {
                if(chs[i] == ' ') {
                    int left = idx, right = i - 1;
                    reserve(chs, left, right);
                    // 指向空格下一个字符
                    idx = i + 1;
                }
            }
            // 最后一个单词是不会遇到' '，因此需要手动翻转一次
            reserve(chs, idx, n - 1);
            return new String(chs);
        }
        public void reserve(char[] chs, int left, int right) {
            while(left < right) {
                char tmp = chs[left];
                chs[left] = chs[right];
                chs[right] = tmp;
                left++;
                right--;
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}