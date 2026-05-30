class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int merge[]=new int[n+m];
        int i=0,j=0;
        int idx=0;
        while(i<n && j<m){
            if(nums1[i]<=nums2[j]){
                merge[idx++]=nums1[i++];
            }else{
                merge[idx++]=nums2[j++];
            }
        }

        while(i<n){
            merge[idx++]=nums1[i++];
        }
        while(j<m){
            merge[idx++]=nums2[j++];
        }
        double median=0;
        if((n+m)%2==0){
            median=(merge[merge.length/2]+merge[(merge.length/2)-1])/2.0;
        }else{
            median=merge[merge.length/2];
        }

        return median;
    }
}
