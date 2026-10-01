class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> hm = new HashSet();
        for(int n:nums){
            if(hm.contains(n)){
                return true;
            }
            hm.add(n);
        }
        return false;
    }
}