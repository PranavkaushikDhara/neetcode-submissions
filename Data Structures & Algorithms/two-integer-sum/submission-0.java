class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> sums=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            sums.put(target-nums[i],i);
        }

        for(int i=0;i<nums.length;i++){
            if(sums.containsKey(nums[i]) && i!=sums.get(nums[i])){
                return new int[]{Math.min(i,sums.get(nums[i])),Math.max(i,sums.get(nums[i]))};
            }
        }
        return new int[]{-1,-1};

    }
}
