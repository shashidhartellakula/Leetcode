class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        HashMap<String,String> map=new HashMap<>();
        for(int i=0;i<knowledge.size();i++){
            map.put(knowledge.get(i).get(0),knowledge.get(i).get(1));
        }
        int i=0;
        StringBuilder sb=new StringBuilder();
        while(i<s.length()){
            
            if(s.charAt(i)=='('){
                int j=i;
                while(s.charAt(i)!=')'){
                    i++;
                }
                String str=s.substring(j+1,i);
                sb.append(map.getOrDefault(str,"?"));
                i++;
            }else{
                
                sb.append(s.charAt(i));
                i++;
            }
        }
        return sb.toString();
    }
}
