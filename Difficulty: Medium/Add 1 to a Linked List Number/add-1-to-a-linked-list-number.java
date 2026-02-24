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
    public Node reverse(Node head){
        Node prev=null;
        Node curr=head;
        while(curr!=null){
            Node next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    public Node addOne(Node head) {
        // code here.
        Node headd=reverse(head);
        Node temp=headd;
        int c=1;
        while(temp!=null){
            int s=temp.data+c;
            temp.data=s%10;
            c=s/10;
            
            if(c==0){
                break;
            }
            if(temp.next==null && c!=0){
                temp.next=new Node(c);
                c=0;
                break;
            }
            temp=temp.next;
        }
        return reverse(headd);
        
    }
}