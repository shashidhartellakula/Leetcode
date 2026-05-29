class Solution {
    public boolean haveConflict(String[] event1, String[] event2) {
        int start1=toMinutes(event1[0]);
        int end1=toMinutes(event1[1]);
        int start2=toMinutes(event2[0]);
        int end2=toMinutes(event2[1]);

        return !(end1<start2 || end2<start1);
    }

    int toMinutes(String t){
        String parts[]=t.split(":");
        return Integer.parseInt(parts[0])*60+Integer.parseInt(parts[1]);
    }
}
