class Solution {
    public int maxSubArray(int[] nums) {
        
        int sum=nums[0];
        int bestsum=nums[0];
        
        for(int i=1;i<nums.length;i++){
            
            sum= (sum>=0)? (sum+=nums[i]):(sum=nums[i]) ;
            
            if(sum>bestsum){
                bestsum=sum;
            }
        }
   return bestsum;
    }
}