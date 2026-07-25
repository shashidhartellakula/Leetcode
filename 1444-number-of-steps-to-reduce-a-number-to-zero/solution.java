class Solution {
    public int numberOfSteps(int num) {
        int count=0;
        return stepcount(num,count);
    }
    static int stepcount(int num,int count){
        if(num==0){
            return count;
        }
        if(num%2==0){
            count++;
            return stepcount(num/2,count);
        }else{
            count++;
            return stepcount(num-1,count);
        }
    }
}
