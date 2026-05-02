class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n=s1.length(),m=s2.length();

        if(n>m) return false;

        int hash[]=new int[26];
        for(char c:s1.toCharArray()){
            hash[c-'a']++;
        }

        int l=0,r=0;
        int count=n;
        while(r<m){

            if(hash[s2.charAt(r)-'a']>0){
                count--;
            }
            hash[s2.charAt(r)-'a']--;

            if(r-l+1>n){
                if(hash[s2.charAt(l)-'a'] >=0){
                    count++;
                }
                hash[s2.charAt(l)-'a']++;
                l++;
            }
            if(count==0){
                return true;
            }
            r++;
        }
        return false;
    }
}
