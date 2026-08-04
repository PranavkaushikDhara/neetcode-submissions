class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> counts = new HashMap<>();
        for (int i : nums) {
            counts.put(i, counts.getOrDefault(i, 0) + 1);
        }
        
        Set<Integer>[] freqs = new HashSet[nums.length + 1];
        for (int i = 0; i < freqs.length; i++) {
            freqs[i] = new HashSet<>();
        }
        
        for (Map.Entry<Integer, Integer> m : counts.entrySet()) {
            freqs[m.getValue()].add(m.getKey());
        }
        
        ArrayList<Integer> al = new ArrayList<>();
        int count = 0;
        for (int i = nums.length; i >= 1; i--) {
            for (int element : freqs[i]) {
                if (count == k) {
                    break;
                }
                al.add(element);
                count++;  
            }
            if (count == k) break;
        }
        
        return al.stream().mapToInt(Integer::intValue).toArray();
    }
}