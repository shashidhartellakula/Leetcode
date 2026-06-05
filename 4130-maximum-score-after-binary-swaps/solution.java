class Solution {
    public long maximumScore(int[] nums, String s) {
        long maxscore=0;

        PriorityQueue<Integer> maxheap=new PriorityQueue<>(Collections.reverseOrder());

        for(int i=0;i<nums.length;i++){
            maxheap.offer(nums[i]);

            if(s.charAt(i)=='1'){
                maxscore+=maxheap.poll();
            }
        }

        return maxscore;
    }
}
