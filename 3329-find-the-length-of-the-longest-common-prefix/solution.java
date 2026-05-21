class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        HashSet<String> hash=new HashSet<>();

        for(int num:arr1){
            String s=String.valueOf(num);
            for(int i=1;i<=s.length();i++){
                hash.add(s.substring(0,i));
            }
        }

        int max=0;

       for(int num:arr2){
            String s=String.valueOf(num);
            for(int i=1;i<=s.length();i++){
                String prefix=s.substring(0,i);
                if(hash.contains(prefix)){
                    max=Math.max(max,i);
                }
            }
        }
        return max;
    }
}
