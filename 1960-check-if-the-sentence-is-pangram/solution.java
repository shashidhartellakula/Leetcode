class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean[] contain=new boolean[26];
        for(int i=0;i<sentence.length();i++){
            char ch=sentence.charAt(i);
            contain[ch-'a']=true;
        }
        for(boolean letter:contain){
            if(!letter){
                return false;
            }
        }
        return true;
    }
}
