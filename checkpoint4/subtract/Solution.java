/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
	public ListNode subtract(ListNode a) {

		ListNode mid = a;
		ListNode end = null;

		ListNode curr = a;
		while (curr.next != null) {
			end = curr.next;
			
			if (end.next != null) {
				end = end.next;
			} else {
				break;
			}
			mid = mid.next;
			curr = end;
		}
		mid = mid.next;

		ListNode b = null;

		if (mid != null) {
			b = new ListNode(mid.val);
			while (mid.next != null) {
				mid = mid.next;
				ListNode tmp = new ListNode(mid.val);
				tmp.next = b;
				b = tmp;
			}
		}

		ListNode start = a;
		ListNode tmp = b;
		while (tmp != null) {
			start.val = tmp.val - start.val;
			tmp = tmp.next;
			start = start.next;
		}

		return a;
	}
}

