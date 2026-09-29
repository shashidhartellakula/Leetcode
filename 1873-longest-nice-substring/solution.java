class Solution {
    public String longestNiceSubstring(String s) {
        int n=s.length();
        String ans="";
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                String str=s.substring(i,j+1);
                boolean nice=true;
                for(int k=i;k<=j;k++){
                    char ch=s.charAt(k);
                    
                    if(Character.isUpperCase(ch)){
                        if(!str.contains(String.valueOf(Character.toLowerCase(ch)))){
                            nice=false;
                            break;
                        }
                    }else if(Character.isLowerCase(ch)){
                        if(!str.contains(String.valueOf(Character.toUpperCase(ch)))){
                            nice=false;
                            break;
                        }
                    }
                }
                if(nice && str.length()>ans.length()){
                    ans=str;
                }
            }
        }
        return ans;
    }
}
