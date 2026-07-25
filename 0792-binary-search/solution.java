class Solution {
    public int search(int[] nums, int target) {
        return bs(nums,target,0,nums.length-1);
    }
    static int bs(int na[],int target,int start,int end){
        int mid=start+(end-start)/2;
        if(start>end){
            return -1;
        }

        if(na[mid]==target){
            return mid;
        }else if(na[mid]<target){
            return bs(na,target,mid+1,end);
        }else{
            return bs(na,target,start,mid-1);
        }
    }
}
