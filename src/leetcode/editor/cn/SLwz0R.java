//给定一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。 
//
// 
//
// 示例 1： 
//
// 
//
// 
//输入：head = [1,2,3,4,5], n = 2
//输出：[1,2,3,5]
// 
//
// 示例 2： 
//
// 
//输入：head = [1], n = 1
//输出：[]
// 
//
// 示例 3： 
//
// 
//输入：head = [1,2], n = 1
//输出：[1]
// 
//
// 
//
// 提示： 
//
// 
// 链表中结点的数目为 sz 
// 1 <= sz <= 30 
// 0 <= Node.val <= 100 
// 1 <= n <= sz 
// 
//
// 
//
// 进阶：能尝试使用一趟扫描实现吗？ 
//
// 
//
// 注意：本题与主站 19 题相同： https://leetcode-cn.com/problems/remove-nth-node-from-end-
//of-list/ 
// Related Topics 链表 双指针 👍 30 👎 0

package leetcode.editor.cn;

import sun.reflect.annotation.AnnotationSupport;

import java.util.List;

//Java：删除链表的倒数第 n 个结点
public class SLwz0R{
    public static void main(String[] args) {
        Solution solution = new SLwz0R().new Solution();
        // TO TEST
    }
    
    //leetcode submit region begin(Prohibit modification and deletion)

// Definition for singly-linked list.
 public class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0, head);
        ListNode cur = new ListNode();
        if (head != null) {
            cur = dummy;
        }
        int len = 0;
        while (head != null) {
            head = head.next;
            len++;
        }
        for (int i = 0; i < (len - n + 1); i++) {
            cur = cur.next;
        }
        cur.next = cur.next.next;
        ListNode ans = dummy.next;
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}