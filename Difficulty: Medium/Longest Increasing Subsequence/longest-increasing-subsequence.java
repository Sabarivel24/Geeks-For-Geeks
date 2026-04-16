class Solution {
    static int lis(int arr[]) {
    ArrayList<Integer>ans=new ArrayList<>();
    for(int x:arr){
        int i=Collections.binarySearch(ans,x);
        if(i<0)i=-(i+1);
        if(i==ans.size())ans.add(x);
        else ans.set(i,x);
    }
    return ans.size();
    }
}