class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        Boolean flag=false;
        // int[] arr=new int[nums.length];
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1])flag=true;
        }
        
       return flag;
    }
}