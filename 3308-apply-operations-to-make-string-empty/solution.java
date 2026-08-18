class Solution {
    public String lastNonEmptyString(String s) {
        int freq[]=new int[26];
        int last[]=new int[26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            freq[ch-'a']++;
            last[ch-'a']=i;
        }
        int maxfreq=0;
        for(int i=0;i<26;i++){
            maxfreq=Math.max(maxfreq,freq[i]);
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(freq[ch-'a']==maxfreq && last[ch-'a']==i){
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
