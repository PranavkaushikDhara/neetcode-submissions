class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String,List<String>> hm = new HashMap();
        for(String str:strs){
            int freq[] = new int[27];
            for(int i=0;i<str.length();i++){
                freq[str.charAt(i)-'a']++;
            }
            String freqStr = Arrays.toString(freq);
            if(!hm.containsKey(freqStr)){
                hm.put(freqStr,new ArrayList<>());
            }
            hm.get(freqStr).add(str);
        }
        return new ArrayList<>(hm.values());
    }
}
