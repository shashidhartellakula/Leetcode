class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> ls=new ArrayList<>();
        int total=1<<n;
        for(int i=0;i<total;i++){
            ls.add(i^(i>>1));
        }
        return ls;
    }
}
