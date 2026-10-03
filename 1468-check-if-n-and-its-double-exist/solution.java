class Solution {
    public boolean checkIfExist(int[] arr) {
        int n=arr.length;
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            int target=2*arr[i];
            int left=0;
            int right=n-1;
            while(left<=right){
                int mid=left+(right-left)/2;
                if(target==arr[mid] && mid!=i){
                    return true;
                }else if(arr[mid]<target){
                    left=mid+1;
                }else{
                    right=mid-1;
                }
            }
        }
        return false;
    }
}
