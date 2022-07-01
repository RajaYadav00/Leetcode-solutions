class Solution {
    public int trap(int[] arr) {
        
        int N=arr.length;
        int[] leftmax=new int[N];
        int[] rightmax=new int[N];
        
        int max=arr[0];
        
        for(int i=0;i<N;i++){
            max=Math.max(max,arr[i]);
            leftmax[i]=max;
        }
        max=arr[N-1];
        for(int i=N-1;i>=0;i--){
            max=Math.max(max,arr[i]);
            rightmax[i]=max;
        }
        
        int water=0;
        for(int i=0;i<N;i++){
            
            // System.out.print(leftmax[i]+" ");
            
            int height=Math.min(leftmax[i],rightmax[i])-arr[i];
            
            water+=height;
        }
        
        return water;
    }
}