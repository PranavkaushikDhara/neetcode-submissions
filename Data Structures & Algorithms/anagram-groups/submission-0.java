class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       HashMap<String,ArrayList<String>> anagrams = new HashMap<>();

       for(String str:strs){
            int freq[]=new int[26];
            for(int i=0;i<str.length();i++){
                freq[str.charAt(i)-'a']++;
            }
            
            anagrams.putIfAbsent(Arrays.toString(freq), new ArrayList());
            anagrams.get(Arrays.toString(freq)).add(str);
       }
        return new ArrayList<>(anagrams.values());
    }
}
