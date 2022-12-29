package algorithms.remove_duplicates_from_sorted_list;

public class Solution {

    public ListNode deleteDuplicates(ListNode head) {
        ListNode currentNode = head;

        if (head == null) {
            return null;
        }

        while (currentNode.next != null) {
            while (currentNode.val == currentNode.next.val) {
                if (currentNode.next.next == null) {
                    currentNode.next = null;
                    return head;
                }

                currentNode.next = currentNode.next.next;
            }

            currentNode = currentNode.next;
        }

        return head;
    }

}
