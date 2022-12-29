package algorithms.remove_duplicates_from_sorted_list;

public class ListNode {

    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {
        System.out.print(val + "-");

        if (next != null) {
            next.toString();
        }

        return null;
    }

}
