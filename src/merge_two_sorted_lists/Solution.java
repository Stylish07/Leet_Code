package merge_two_sorted_lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode mergeList = null;
        List<Integer> temp = new ArrayList<>();

        if (list1 != null) {
            while (list1.next != null) {
                temp.add(list1.val);
                list1 = list1.next;
            }
            temp.add(list1.val);
        }

        if (list2 != null) {
            while (list2.next != null) {
                temp.add(list2.val);
                list2 = list2.next;
            }
            temp.add(list2.val);
        }

        temp.sort(Collections.reverseOrder());

        for (Integer nodeVal : temp) {
            mergeList = new ListNode(nodeVal, mergeList);
        }

        return mergeList;
    }
}
