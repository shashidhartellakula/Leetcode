class Solution {
    public String minWindow(String s, String t) {
        if(s.length()<t.length()){
            return "";
        }
        int[] hash=new int[256];
        for(char ch:t.toCharArray()){
            hash[ch]++;
        }
        int l=0,r=0;
        int minlength=Integer.MAX_VALUE;
        int Sindex=-1;
        int count=0;
        int n=s.length(),m=t.length();
        while(r<n){
            if(hash[s.charAt(r)]>0){
                count++;
            }
            hash[s.charAt(r)]--;

            while(count==m){
                if(r-l+1<minlength){
                    minlength=r-l+1;
                    Sindex=l;
                }
                hash[s.charAt(l)]++;
                if(hash[s.charAt(l)]>0){
                    count--;
                }
                l++;
            }
            r++;
        }
        return Sindex==-1?"":s.substring(Sindex,Sindex+minlength);
    }
}
