class Solution {
    public String findDifferentBinaryString(String[] nums) {
        StringBuilder answer=new StringBuilder();
        for(int i=0;i<nums.length;i++){
            char c=nums[i].charAt(i);
            if(c=='0'){
                answer.append('1');
            }else{
                answer.append('0');
            }
        }
        return answer.toString();
    }
}
