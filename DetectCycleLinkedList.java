public class DetectCycleLinkedList {
    public ListNode detectCycle(ListNode head) {
        if(head==null) return null;
        ListNode slow=head;
        ListNode fast=head;
        boolean flag=false;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){
                flag=true;
                break;
            }
        }
        if(!flag) return null;
        slow = head;
        while(slow != fast){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }



  class ListNode {
      int val;
   ListNode next;
    ListNode(int x) {
       val = x;
       next = null;
   }
 }


}
/*
ListNode slow=head;
        ListNode fast=head;

        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
            if(fast!=null)
            fast=fast.next;
            if(slow==fast)break;
        }
        if(fast==null)return null;
        slow=head;
        while(slow!=fast){
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }

 */

