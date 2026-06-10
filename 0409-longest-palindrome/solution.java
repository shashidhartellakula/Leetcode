class Solution {
    public int longestPalindrome(String s) {
        
        int[] freq=new int[128];
        for(char ch:s.toCharArray()){
            freq[ch]++;
        }

        int len=0;
        boolean odd=false;
        for(int count:freq){
            len+=(count/2)*2;

            if(count%2!=0){
                odd=true;
            }
        }

        return odd ? len+1:len;
    }
}
