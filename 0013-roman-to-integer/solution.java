class Solution {
    public int romanToInt(String s) {
        int total=0;
        int prev=0;
        for(int i=s.length()-1;i>=0;i--){
            int cur=valueof(s.charAt(i));
            if(cur<prev){
                total-=cur;
            }else{
                total+=cur;
            }
            prev=cur;
        }
        return total;
    }

    public int valueof(char c){
        if(c=='I') return 1;
        if(c=='V') return 5;
        if(c=='X') return 10;
        if(c=='L') return 50;
        if(c=='C') return 100;
        if(c=='D') return 500;
        if(c=='M') return 1000;
        return 0;
    }
}
