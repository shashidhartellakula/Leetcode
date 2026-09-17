class Solution {
    public List<String> readBinaryWatch(int turnedOn) {
        List<String> ls=new ArrayList<>();
        for(int i=0;i<12;i++){
            for(int j=0;j<60;j++){
                int count=Integer.bitCount(i);
                count+=Integer.bitCount(j);
                if(count==turnedOn){
                    ls.add(i+":"+(j<10?"0"+j:j));
                }
            }
        }
        return ls;
    }
}
