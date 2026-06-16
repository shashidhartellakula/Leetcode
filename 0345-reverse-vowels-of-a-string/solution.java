class Solution {
    public String reverseVowels(String s) {
        ArrayList<Character> cha=new ArrayList<>();

        for(char ch:s.toCharArray()){
            if("aeiouAEIOU".indexOf(ch)!=-1){
                cha.add(ch);
            }
        }
        int n=s.length();
        StringBuilder sb=new StringBuilder();
        int k=cha.size()-1;
        for(char ch:s.toCharArray()){
            if("aeiouAEIOU".indexOf(ch)!=-1){
                sb.append(cha.get(k));
                k--;
            }else{
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
