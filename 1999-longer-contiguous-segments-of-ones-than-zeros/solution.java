class Solution {
    public boolean checkZeroOnes(String s) {
        
        int n=s.length();
        int count=0,count1=0;
        int max=Integer.MIN_VALUE,max1=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='1'){
                count++;
            }else{
                max=Math.max(max,count);
                count=0;
            }
        }
        max=Math.max(count,max);
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='0'){
                count1++;
            }else{
                max1=Math.max(max1,count1);
                count1=0;
            }
        }
        max1=Math.max(max1,count1);
        return max>max1;
    }
}
