class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int N=nums.length;
        int sume=0;
        Map<Integer,Integer> map=new HashMap<>();
       for(int i=0;i<N;i++){
           int x=target-nums[i];
           if(map.containsKey(x)){
               return new int[]{i,map.get(x)};
           }else{
               map.put(nums[i],i);
           }
       }
        
        return null;
    }    
}