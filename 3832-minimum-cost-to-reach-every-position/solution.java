class Solution {
    public int[] minCosts(int[] cost) {
        int ans[]=new int[cost.length];
        int curmin;
          for(int i=0;i<cost.length;i++){
              curmin=mini(cost,i);
              if(curmin<cost[i]){
                  ans[i]=curmin;
              }else{
                  ans[i]=cost[i];
              }
          }
        return ans;
    }
    public static int mini(int a[],int n){
        int curmin=a[0];
        for(int i=0;i<n;i++){
            if(a[i]<curmin){
                curmin=a[i];
            }
        }
        return curmin;
    }
}
