class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        Boolean flag=false;
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){flag=true;break;}
        }
        
       return flag;
    }
}