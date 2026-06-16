/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode temp=head;

        while(temp.next!=null){
            
            
            int c=gcd(temp.val,temp.next.val);
            ListNode curr=new ListNode(c);
            curr.next=temp.next;
            temp.next=curr;
            temp=curr.next;
        }
        return head;
    }
    int gcd(int a,int b){
        while(b!=0){
            int temo=b;
            b=a%b;
            a=temo;
        }
        return a;
    }
}
