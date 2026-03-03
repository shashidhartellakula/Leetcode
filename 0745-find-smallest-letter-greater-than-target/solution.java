class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int sta=0;
        int end=letters.length-1;
        while(sta<=end){
            int mid=sta+(end-sta)/2;
            if(target < letters[mid]){
                end=mid-1;
            }else{
                sta=mid+1;
            }
        }
        return letters[sta%letters.length];
    }
}
