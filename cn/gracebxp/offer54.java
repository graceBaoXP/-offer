package cn.gracebxp;

/**
 * 链表中环的入口结点
 *
 * 给一个链表，若其中包含环，请找出该链表的环的入口结点，否则，输出null。
 */
public class offer54 {

    public ListNode EntryNodeOfLoop(ListNode pHead)
    {
        if (pHead==null||pHead.next==null){
            return null;
        }
        ListNode fast=pHead,slow=pHead;
        do {
            fast=fast.next.next;
            slow=slow.next;
        }while (slow!=fast);
        fast=pHead;
        while (slow!=fast){
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }


}

 class ListNode {

    int val;
    ListNode next = null;

     public ListNode() {
     }

     ListNode(int val) {
        this.val = val;
    }

}
