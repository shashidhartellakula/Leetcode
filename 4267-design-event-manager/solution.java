class EventManager {
     HashMap<Integer,Integer> map=new HashMap<>();
     PriorityQueue<int[]> p=new PriorityQueue<>(new Comparator<int[]>(){
            public int compare(int[] a,int[] b){
                if(a[0]==b[0]){
                    return a[1]-b[1];
                }
                return b[0]-a[0];
            }
        });
    public EventManager(int[][] events) {
       int abc[][]=events;
        for(int[] e:abc){
            map.put(e[0],e[1]);
            p.add(new int[]{e[1],e[0]});
        }
    }
    
    public void updatePriority(int eventId, int newPriority) {
        map.put(eventId,newPriority);
        p.add(new int[]{newPriority,eventId});
    }
    
    public int pollHighest() {
        while(!p.isEmpty()){
            int[] top=p.poll();
            int pr=top[0];
            int id=top[1];
            if(map.containsKey(id) && map.get(id)==pr){
                map.remove(id);
                return id;
            }
        }
        return -1;
    }
}

/**
 * Your EventManager object will be instantiated and called as such:
 * EventManager obj = new EventManager(events);
 * obj.updatePriority(eventId,newPriority);
 * int param_2 = obj.pollHighest();
 */
