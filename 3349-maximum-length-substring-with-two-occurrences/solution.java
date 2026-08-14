class Solution {
    public int maximumLengthSubstring(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int left=0;
        int n=s.length();
        int maxlen=0;
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
            while(map.get(ch)>2){
                map.put(s.charAt(left),map.get(s.charAt(left))-1);
                left++;
            }
            maxlen=Math.max(i-left+1,maxlen);
        }
        return maxlen;
    }
}
