class Solution {
    public int minJumps(int[] arr) {

        int i = 0;
        int c = 0;
        int n = arr.length;
        while(i < n - 1) {
            int v = arr[i];
            if(i + v >= n - 1)
                return c + 1;
            int maxs = 0;
            int maxi = -1;
            for(int j = 1; j <= v && i + j < n; j++) {
                int ni = i + j;

                if(ni + arr[ni] > maxs) {
                    maxs = ni + arr[ni];
                    maxi = ni;
                }
            }
            if(maxi == -1) return -1;
            i = maxi;
            c++;
        }
        return c;
    }
}
