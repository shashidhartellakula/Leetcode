class Solution {
    public int maxArea(int[] height) {
        
        
        int n=height.length;
        if(n==0){
            return 0;
        }
        int left=0;
        int end=n-1;
        int max=Integer.MIN_VALUE;
        while(left<end){
            if(height[left]<height[end]){
                int cal=(end-left)*height[left];
                max=Math.max(max,cal);
                left++;
            }else {
                int cal=(end-left)*height[end];
                max=Math.max(max,cal);
                end--;
            }
        }
        return max;
    }
}
