class Solution {
    public char processStr(String s, long k) {
        if(k<0){
            return '.';
        }
        long len=0;
        long limit=k+1;
        
        for(char ch:s.toCharArray()){
            if(ch>='a' && ch<='z'){              
                len++;               
            }else if(ch == '#'){
                len*=2;
            }else if(ch=='*'){
                if(len>0){
                    len--;
                }
            }
        }

        if(k>=len){
            return '.';
        }

        for(int i=s.length()-1;i>=0;i--){
            char ch=s.charAt(i);
            if(ch>='a' && ch<='z'){
                if(k==len-1){
                    return ch;
                }
                len--;
            }else if(ch=='#'){
                len/=2;
                k%=len;
            }else if(ch=='%'){
                k=len-1-k;
            }else if(ch=='*'){
                len++;
            }
        }
        return '.';
    }
}
