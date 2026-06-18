class Solution {
    public double angleClock(int hour, int minutes) {
        double hr=(double) (hour*30+minutes*0.5);
        double min=(double) (minutes*6);

        double diff=Math.abs(hr-min);

        if(diff>180){
            return (double)360-diff;
        }
        return diff;
    }
}
