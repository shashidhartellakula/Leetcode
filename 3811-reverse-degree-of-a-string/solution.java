class Solution {
    public int reverseDegree(String s) {
        int sum=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int reverseindex=26-(ch-'a');
            int position=i+1;
            sum+=reverseindex*position;
        }
        return sum;
    }
}
