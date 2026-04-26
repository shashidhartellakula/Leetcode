class Solution {
    public String sortVowels(String s) {
        int n=s.length();
        Set<Character> vowels=new HashSet<>(Arrays.asList('a','e','i','o','u'));
        List<Character> vowel=new ArrayList<>();
        Map<Character,Integer> freq=new HashMap<>();
        Map<Character,Integer> firstidx=new HashMap<>();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(vowels.contains(ch)){
                vowel.add(ch);
                freq.put(ch,freq.getOrDefault(ch,0)+1);
                firstidx.putIfAbsent(ch,i);
            }
        }

        Collections.sort(vowel,(a,b)->{
            if(!freq.get(a).equals(freq.get(b))){
                return freq.get(b)-freq.get(a);
            }
            return firstidx.get(a)-firstidx.get(b);
        });
        StringBuilder sb=new StringBuilder(s);
        int idx=0;
        for(int i=0;i<n;i++){
            if(vowels.contains(s.charAt(i))){
                sb.setCharAt(i,vowel.get(idx++));
            }
        }
        return sb.toString();
    }
}
