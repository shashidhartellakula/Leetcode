class Solution {
    int mem[]=new int[38];
    public int tribonacci(int n) {        
      if(n==0){
        return 0;
      }else if(n==1 || n==2){
        return 1;
      }else if(mem[n]!=0){
        return mem[n];
      }else{
        mem[n]=tribonacci(n-1)+tribonacci(n-2)+tribonacci(n-3);
      }

      return mem[n];
    }
}
