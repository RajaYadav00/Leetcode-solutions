class Solution {
    public int search(int[] nums, int target) {
        int ans;
       
        int min=findmin(nums);
        
        if(target>=nums[min]  && target<=nums[nums.length-1]){
            ans=binerysearch(nums,min,nums.length-1,target);
            
        }else{
            ans=binerysearch(nums,0,min-1,target);
        }
      return ans;  
        
    }
    public static int findmin(int[] arr){
        
        int l=0;
        int r=arr.length-1;
        
        while(l<r){
            
            int mid=l+(r-l)/2;
            
            if(arr[mid]>arr[r]){
                l=mid+1;
            }else{
                r=mid;
            }
        }
        return l;
    }
    
    public static int binerysearch(int[] arr,int l,int r,int target){
        
        
        while(l<=r){
            
            int mid=l+(r-l)/2;
            
            if(arr[mid]==target){
                
                return mid;
                
            }else if( arr[mid]<target){
                
                l=mid+1;
                
            }else{
                
                r=mid-1;
            }
        }
        return -1;
    }
}