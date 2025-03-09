class Solution {
    public static int maximumWealth(int[][] accounts) {
        int maxwealth=0;
        for(int[] customer:accounts){
            int wealth=0;
            for(int bank:customer){
                wealth+=bank;
            }
            maxwealth=Math.max(maxwealth,wealth);
        }
        return maxwealth;
    }
    public static void main(String[] args){
        System.out.println(maximumWealth(new int[][]{{1,2,3},{3,2,1}}));
        System.out.println(maximumWealth(new int[][]{{1,5},{7,3},{3,5}})); 
        System.out.println(maximumWealth(new int[][]{{2,8,7},{7,1,3},{1,9,5}}));
    }
}
