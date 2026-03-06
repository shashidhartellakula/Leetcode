class Solution {
    public boolean checkOnesSegment(String s) {
        boolean zeroseen=false;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0'){
                zeroseen=true;
            }else if(zeroseen && s.charAt(i)=='1'){
                return false;
            }
        }
        return true;
    }
}
