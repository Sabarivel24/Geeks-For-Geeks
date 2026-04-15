/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/
class Solution {
    public Node insertAtEnd(Node head, int x) {
        Node temp=new Node(x);
        if(head==null){
            head=temp;
            return head;
        }
        Node p=head;
        while(p.next!=null){
            p=p.next;
        }
        p.next=temp;
        return head;
        
    }
}