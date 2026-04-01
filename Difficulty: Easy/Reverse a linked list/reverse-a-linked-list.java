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
    Node reverseList(Node head) {
 
        Node temp=head;
        Node p=null;
        while(temp!=null){
            Node q=temp.next;
            temp.next=p;
            p=temp;
            temp=q;
        }
        return p;
    }
}