class Solution {
    public int findClosest(int x, int y, int z) {
        int ans=Math.abs(x-z);
        int ans1=Math.abs(z-y);
        if(ans<ans1){
            return 1;
        }else if(ans>ans1){
            return 2;
        }else{
            return 0;
        }
    }
}
