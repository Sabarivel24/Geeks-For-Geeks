/*
Structure of a Doubly LinkList
class Node {
    int data;
    Node next;
    Node prev;

    Node(int val) {
        data = val;
        next = null;
        prev = null;
    }
}
*/
class Solution {
    public Node delPos(Node head, int x) {
        if(head==null)return null;
        if(x==1){
          head=head.next;
          if(head!=null)
            head.prev=null;
        return head;
        }
        Node q=head;
        int c=1;
        while(c<x-1&&q.next!=null){
            c++;
            q=q.next;
        }
        if(q.next!=null){
        q.next=q.next.next;
        if(q.next!=null)
            q.next.prev=q;
        
        }
      
        return head;
    }
}