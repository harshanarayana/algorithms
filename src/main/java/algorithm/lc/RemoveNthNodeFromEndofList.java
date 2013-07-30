package algorithm.lc;

public class RemoveNthNodeFromEndofList {

  public class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
      val = x;
      next = null;
    }
  }

  public class Solution {
    // use two pointer, first pointer moves n steps, then both move forard,
    // when first reaches to the end, second stops at the n to the end
    public ListNode removeNthFromEnd(ListNode head, int n) {
      // Start typing your Java solution below
      // DO NOT write main() function
      ListNode first = head;
      ListNode second = head;
      int count = 0;
      while (first != null && count < n) {
        first = first.next;
        ++count;
      }

      if (first == null) {
        return second.next;
      }
      // when first reaches to the end, second is n from the end
      while (first.next != null) {
        first = first.next;
        second = second.next;
      }

      second.next = second.next.next;
      return head;
    }
  }

}
