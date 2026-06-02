class Solution {
    public int countKeyChanges(String s) {
        int count=0;
        int len=s.length();
        for(int i=0;i<len-1;i++){
            char ch=s.charAt(i);
            char next=s.charAt(i+1);
            if((next!=ch+32)&&(next!=ch-32)&&next!=ch){
                count++;
            }
        }

        return count;
    }
}
