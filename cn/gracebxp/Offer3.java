package cn.gracebxp;

import java.util.ArrayList;

/**
 * 从尾到头打印链表
 *
 * 输入一个链表，按链表值从尾到头的顺序返回一个ArrayList。
 */
public class Offer3 {

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
         ArrayList<Integer> list=new ArrayList<>();
         if (listNode!=null){
             list.addAll(printListFromTailToHead(listNode.next));
             list.add(listNode.val);
         }
         return list;
    }

}
