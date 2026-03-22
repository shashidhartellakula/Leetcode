class Solution {
    public String defangIPaddr(String address) {
        String hello=address.replace(".","[.]");
        return hello;
    }
}
