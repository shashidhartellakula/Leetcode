class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        boolean[] allochar=new boolean[26];
        for(char ch:allowed.toCharArray()){
            allochar[ch-'a']=true;
        }
        int count=0;
        for(String word:words){
            boolean isconsist=true;
            for(int i=0;i<word.length();i++){
                char ch=word.charAt(i);
                if(!allochar[ch-'a']){
                    isconsist=false;
                    break;
                }
            }
            if(isconsist) count++;
        }
        return count;
    }
}
