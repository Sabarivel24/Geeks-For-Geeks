/*
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
*/

class Pair{
    Node node;
    int hd;
    Pair(Node n,int h){
        node=n;
        hd=h;
    }
}

class Solution {
    public ArrayList<Integer> bottomView(Node root) {
        // code here
         ArrayList<Integer>ans=new ArrayList<>();
        if(root==null)return ans;
        Queue<Pair>q=new LinkedList<>();
        TreeMap<Integer,Integer>map=new TreeMap<>();
        q.offer(new Pair(root,0));
        while(!q.isEmpty()){
            Pair p=q.poll();
            Node node=p.node;
            int hd=p.hd;
            map.put(hd,node.data);
            if(node.left!=null)q.offer(new Pair(node.left,hd-1));
            if(node.right!=null)q.offer(new Pair(node.right,hd+1));
        }
        for(int val:map.values()){
            ans.add(val);
        }
        return ans;
    }
}