class Solution {
    public int[] sortByBits(int[] arr) {
        int n=arr.length;
        int ans[][]=new int[n][2];
        for(int i=0;i<n;i++){
            ans[i][0]=arr[i];
            ans[i][1]=Integer.bitCount(arr[i]);
        }

        int ans1[]=new int[n];
        Arrays.sort(ans,(a,b)->{
            if(a[1]!=b[1]){
                return Integer.compare(a[1],b[1]);
            }
            return Integer.compare(a[0],b[0]);
        });
        for(int i=0;i<n;i++){
            ans1[i]=ans[i][0];
        }
        return ans1; 
    }
}
