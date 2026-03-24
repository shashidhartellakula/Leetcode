class Solution {
    public String sortSentence(String s) {
        String[] words=s.split(" ");
        String[] res=new String[words.length];
        for(String word:words){
            int len=word.length();
            int position=word.charAt(len-1)-'0';
            res[position-1]=word.substring(0,len-1);
        }
        return String.join(" ",res);
    }
}
