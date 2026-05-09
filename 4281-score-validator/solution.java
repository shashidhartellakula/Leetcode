class Solution {
    public int[] scoreValidator(String[] events) {
        int counter=0;
        int score=0;
        int n=events.length;
        for(int i=0;i<n;i++){
            if(events[i].equals("W")){
                counter++;
                if(counter==10){
                break;
            }
            }else if(events[i].equals("WD") || events[i].equals("NB")){
                score++;
            }else{
                int curr=Integer.parseInt(events[i]);
                score+=curr;
            }

            
        }

        return new int[]{score,counter};
    }
}
