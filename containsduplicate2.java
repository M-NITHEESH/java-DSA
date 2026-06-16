class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> bin = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(bin.containsKey(nums[i])){
                int lastseen=bin.get(nums[i]);
                if(i-lastseen<=k){
                    return true;
                }
            }
            bin.put(nums[i],i);

        }
        return false;
        
    }
}