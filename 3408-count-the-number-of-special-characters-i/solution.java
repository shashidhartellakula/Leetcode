class Solution {
    public int numberOfSpecialChars(String word) {
        HashSet<Character> chi=new HashSet<>();
        int cnt=0;
        for(int i=0;i<word.length();i++){
            chi.add(word.charAt(i));
        }

        for(char ch='a';ch<='z';ch++){
            if(chi.contains(ch) && chi.contains(Character.toUpperCase(ch))){
                cnt++;
            }
        }

        return cnt;
    }
}
