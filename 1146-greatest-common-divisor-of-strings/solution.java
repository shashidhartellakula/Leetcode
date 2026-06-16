class Solution {
    public String gcdOfStrings(String str1, String str2) {
        int s1=str1.length();
        int s2=str2.length();

        if(!(str1+str2).equals(str2+str1)){
            return "";
        }
        int len=gcd(s1,s2);
        return str1.substring(0,len);
    }

    int gcd(int a,int b){

        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
}
