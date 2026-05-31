class Solution {
    public List<String> buildArray(int[] target, int n) {
        
        List<String> ls=new ArrayList<>();
        int curr=1;
        for(int num:target){
            while(curr<num){
                ls.add("Push");
                ls.add("Pop");
                curr++;
            }
            ls.add("Push");
            curr++;
        }

        return ls;
    }
}
