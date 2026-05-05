class Solution {
    public boolean isPalindrome(String s) {
        String str=s.toLowerCase();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                sb.append(ch);
            }
        }

        String cleaned=sb.toString();
        String reverse=sb.reverse().toString();
        return cleaned.equals(reverse);
    }
}
