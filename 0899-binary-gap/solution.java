class Solution {
    public int binaryGap(int n) {
        String str=Integer.toBinaryString(n);
        int prev=0;
        int max=0;
        for(int i=0;i<str.length();i++){
            if(prev!=-1&&str.charAt(i)=='1'){
                
                max=Math.max(max,i-prev);
                prev=i;
            }
            
        }
        return max;
    }
}
