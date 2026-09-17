class Solution {
    public int findComplement(int num) {
        int bitlen=Integer.toBinaryString(num).length();
        int mask=(1<<bitlen) -1;
        return num^mask;
    }
}
