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
    ArrayList<Integer>ans;
    public void func(Node root){
        if(root==null)return ;
        func(root.left);
        func(root.right);
        ans.add(root.data);
    }
    public ArrayList<Integer> postOrder(Node root) {
       ans=new ArrayList<>();
       func(root);
       return ans;
    }
}