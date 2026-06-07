class Solution {
    public List<String> generateValidStrings(int n, int k) {
        List<String> ans=new ArrayList<>();

        track(0,n,k,0,false,new StringBuilder(),ans);

        return ans;
    }
    public void track(int idx,int n,int k,int cost,boolean prev,StringBuilder sb,List<String> ans){

        if(cost > k){
            return;
        }

        if(idx==n){
            ans.add(sb.toString());
            return;
        }


        sb.append('0');
        track(idx+1,n,k,cost,false,sb,ans);
        sb.deleteCharAt(sb.length()-1);

        if(!prev){
            sb.append('1');
            track(idx+1,n,k,cost+idx,true,sb,ans);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}
