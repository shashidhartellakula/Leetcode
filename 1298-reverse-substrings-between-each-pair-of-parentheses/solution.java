class Solution {
    public String reverseParentheses(String s) {
        Stack<StringBuilder> stack=new Stack<>();
        StringBuilder sb=new StringBuilder();
        for(char c:s.toCharArray()){
            if(c=='('){
                stack.push(sb);
                sb=new StringBuilder();
            }else if(c==')'){
                sb.reverse();
                sb=stack.pop().append(sb);
            }else{
                sb.append(c);
            }
        } 
        return sb.toString();
    }
}
