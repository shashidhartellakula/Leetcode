class Solution {
    public int passwordStrength(String password) {
        Set<Character> h=new HashSet<>();
        int n=password.length();
        for(int i=0;i<n;i++){
            h.add(password.charAt(i));
        }
        //int len=
        int count=0;
        for(char ch:h){
            
            if(ch>='a' && ch<='z'){
                count+=1;
            }else if(ch>='A' && ch<='Z'){
                count+=2;
            }else if(ch>='0' && ch<='9'){
                count+=3;
            }else if("!@#$".contains(String.valueOf(ch))){
                count+=5;
            }
        }

        return count;
    }
}
