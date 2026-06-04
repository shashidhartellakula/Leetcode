class Solution {
    public int totalWaviness(int num1, int num2) {
        int count=0;

        for(int i=num1;i<=num2;i++){

            String str=Integer.toString(i);
            if(str.length()<3){
                count+=0;
                continue;
            }
            for(int j=1;j<str.length()-1;j++){
                char prev=str.charAt(j-1);
                char curr=str.charAt(j);
                char next=str.charAt(j+1);
                if((curr>prev && curr>next)||(curr<prev && curr<next)){
                    count++;
                }
            }
        }
        return count;
    }
}
