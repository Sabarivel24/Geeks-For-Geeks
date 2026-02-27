/*
class Node {
    int data;
    Node left, right;
    Node(int val){
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    ArrayList<Integer>res;
    public void func(Node root){
        if(root==null)return;
        func(root.left);
        func(root.right);
        res.add(root.data);
    }
    public ArrayList<Integer> postOrder(Node root) {
        // code here
        res=new ArrayList<>();
        func(root);
        return res;
    }
}