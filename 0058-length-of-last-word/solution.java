class Solution {
    public int lengthOfLastWord(String s) {
        String a[]=s.trim().split(" ");
        int last=a.length-1;
        String k=a[last];
        return k.length();
    }
}
