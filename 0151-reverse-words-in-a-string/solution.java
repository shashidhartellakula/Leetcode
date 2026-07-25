class Solution {
    public String reverseWords(String s) {
        String a[]=s.trim().split("\\s+");
        StringBuilder sb=new StringBuilder();
        int n=a.length;
        for(int i=n-1;i>=0;i--){
            sb.append(a[i]);
            if(i==0)
                break;
            sb.append(" ");
        }
        return sb.toString();
    }
}
