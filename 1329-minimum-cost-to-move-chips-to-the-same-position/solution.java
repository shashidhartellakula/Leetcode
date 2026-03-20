class Solution {
    public int minCostToMoveChips(int[] position) {
        int eve=0,od=0;
        for(int pos:position){
            if(pos%2==0){
                eve++;
            }else{
                od++;
            }
        }
        return Math.min(eve,od);
    }
}
