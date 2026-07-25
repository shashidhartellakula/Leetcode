class Solution {
    public boolean isPowerOfTwo(int n) {
        return p(n);
    }

    static boolean p(int n){
        if(n==1){
            return true;
        }

        if(n>1){
            if(n%2==0){
                return p(n/2);
            }
            
        }
        return false;
    }
}
