class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        int n=asteroids.length;
        long Currmass=mass;
        for(int i=0;i<n;i++){
            if(Currmass<asteroids[i]){
                return false;
            }else{
                Currmass+=asteroids[i];
            }
        }

        return true;
    }
}
