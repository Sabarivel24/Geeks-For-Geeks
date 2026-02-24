/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
      public int countlength(Node check){
            int c=1;
            Node temp=check.next;
            while(temp!=check){
                c++;
                temp=temp.next;
            }
            return c;
        }
    public int lengthOfLoop(Node head) {
        // code here
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return countlength(slow);
            }
        }
        return 0;
      
    }
}