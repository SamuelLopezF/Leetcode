public class App {

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
    }

    class Solution {
        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            ListNode shit = new ListNode();
            ListNode result = shit;

            while (list1 != null && list2 != null) {
                if (list1.val > list2.val) {
                    result = list2;
                    list2 = list2.next;
                    result = result.next;
                } else {
                    result = list1;
                    list1 = list1.next;
                    result = result.next;
                }
            }
            result.next = list1 == null ? list1 : list2;

            return shit.next;
        }
    }
    // 1123 2334
    // 1 > 2 no
    // 1 > 2 no

    // result = 1 ->
    public static void main(String[] args) throws Exception {
        System.out.println([1,2,4],[1,3,4]);
    }
}
