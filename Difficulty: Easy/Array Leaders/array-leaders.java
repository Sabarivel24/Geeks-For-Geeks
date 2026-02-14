class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        ArrayList<Integer>ans=new ArrayList<>();
        int maxvalue=Integer.MIN_VALUE;
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]>=maxvalue){
                ans.add(arr[i]);
            }
            maxvalue=Math.max(maxvalue,arr[i]);
        }
        Collections.reverse(ans);
        return ans;
    }
}
