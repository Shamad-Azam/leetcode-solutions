class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0);
        ListNode a2 = dummy;

    while (list1 != null && list2 != null) {
        if (list1.val <= list2.val) {
            a2.next = list1;
            list1 = list1.next;
            } else {
                a2.next = list2;
                list2 = list2.next;
            }
            a2 = a2.next;
        }
        a2.next = (list1 != null) ? list1 : list2;

        return dummy.next;
    }
}
