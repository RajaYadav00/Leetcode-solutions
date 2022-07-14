class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int N=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        
        for(int i=0;i<N;i++){
            
            int dif=target-nums[i];
            
            if(map.containsKey(dif)){
                
                int ind=map.get(dif);
                return new int[]{ind,i};
            }
            map.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }
}