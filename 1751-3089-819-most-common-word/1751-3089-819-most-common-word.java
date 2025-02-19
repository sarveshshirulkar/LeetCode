class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        String[] str=paragraph.toLowerCase().replaceAll("\\W+" , " ").split("\\s+");
        Map<String,Integer> map = new HashMap<>();
        for(String i : str){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int i=0; i<banned.length; i++) map.remove(banned[i]);
        int max = -1;
        String ans = "";
        for(String i : map.keySet()){
            if(max < map.get(i)){
                ans = i;
                max = map.get(i);
            }
        }
        return ans;
    }
}