class Solution {
    public long weightedSum(int[] parent, int[] nums) {
        int n=parent.length;

        List<List<Integer>> child=new ArrayList<>();
        for(int i=0;i<n;i++){
            child.add(new ArrayList<>());
        }

        for(int i=1;i<n;i++){
            child.get(parent[i]).add(i);
        }

        int depth[]=new int[n];

        Queue<Integer> qu=new LinkedList<>();
        qu.offer(0);
        depth[0]=1;
        int height=1;
        while(!qu.isEmpty()){
            int node=qu.poll();
            for(int chil:child.get(node)){
                depth[chil]=depth[node]+1;
                height=Math.max(height,depth[chil]);

                qu.offer(chil);
            }
        }
        long ans=0;
        for(int i=0;i<n;i++){
            long weight=(long) nums[i]*(height-depth[i]+1);
            ans+=weight;
        }

        return ans;
    }
}
