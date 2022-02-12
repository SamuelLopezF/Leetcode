public class App {
    
    public class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    static public ListNode deleteDuplicates(ListNode head)
    {
        ListNode current = head;
        ListNode nextNode = (head != null)? head.next: null;
        while(nextNode != null)
        {
            if(current.val == nextNode.val)
            {
                current.next = nextNode.next;
            }else{
                current = nextNode.next;
                nextNode = current.next;
            }
        }
        return head;
    }



    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}
