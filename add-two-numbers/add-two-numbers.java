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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        int resultVal = l1.val + l2.val;
        ListNode resultNode = new ListNode(resultVal);
        
        if(resultNode.val>=10){
            
            resultNode.val -= 10;
            
            if(l1.next!=null && l2.next!=null){
                resultNode.next = addTwoNumbers(l1.next, l2.next); 
                
                resultNode.next = addTwoNumbers(new ListNode(1), resultNode.next);
                
            } else if (l1.next==null && l2.next==null){
                resultNode.next = new ListNode(1); 
            } else {
                if(l1.next != null){
                    resultNode.next = l1.next; 
                }else if(l2.next != null){
                    resultNode.next = l2.next; 
                }
                resultNode.next = addTwoNumbers(new ListNode(1), resultNode.next);
            }
        }
        else{
            
            if(l1.next!=null && l2.next!=null){
                resultNode.next = addTwoNumbers(l1.next, l2.next); 
                
            } else if (l1.next==null && l2.next==null){
                //No calculation
            } else {
                if(l1.next != null){
                    resultNode.next = l1.next; 
                } else if(l2.next != null){
                    resultNode.next = l2.next; 
                }
            }
        }
        
        return resultNode;
        
    }
}
