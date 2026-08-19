class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        Map<Integer,Set<Integer>> ls=new HashMap<>();
        int r=reservedSeats.length;
        for(int i=0;i<r;i++){
            int row=reservedSeats[i][0];
            int col=reservedSeats[i][1];
            Set<Integer> set=ls.getOrDefault(row,new HashSet<>());
            set.add(col);
            ls.put(row,set);   
        }

        int ans=2*n;
        for(int row:ls.keySet()){
            boolean left=true;
            boolean middle=true;
            boolean right=true;
            Set<Integer> set=ls.get(row);
            for(int i=2;i<=5;i++){
                if(set.contains(i)){
                    left=false;
                }
            }
            for(int i=4;i<=7;i++){
                if(set.contains(i)){
                    middle=false;
                }
            }
            for(int i=6;i<=9;i++){
                if(set.contains(i)){
                    right=false;
                }
            }

            if(left&right){
                continue;
            }else if(left || middle || right){
                ans--;
            }else{
                ans=ans-2;
            }
        }
        return ans;
    }
}
