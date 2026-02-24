class Solution {
    ArrayList<ArrayList<Integer>>ans;
    ArrayList<Integer>temp;
    public void func(int index,int[] a){
        if(index==a.length){
            ans.add(new ArrayList<>(temp));
            return;
        }
        //Take 
        temp.add(a[index]);
        func(index+1,a);
        
        //Backtrack
        temp.remove(temp.size()-1);
        
        //Not take
        func(index+1,a);
    }
    public ArrayList<ArrayList<Integer>> subsets(int arr[]) {
        // code here
        ans=new ArrayList<>();
        temp=new ArrayList<>();
        func(0,arr);
        return ans;
    }
}