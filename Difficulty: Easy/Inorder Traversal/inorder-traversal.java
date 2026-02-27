/*
class Node {
    int data;
    Node left, right;
    Node(int item){
        data = item;
        left = right = null;
    }
}
*/
class Solution {
    ArrayList<Integer>res;
    public void func(Node root){
        if(root==null)return;
        func(root.left);
        res.add(root.data);
        func(root.right);
    } 
    public ArrayList<Integer> inOrder(Node root) {
        // code here
        res=new ArrayList<Integer>();
        func(root);
        return res;
    }
}