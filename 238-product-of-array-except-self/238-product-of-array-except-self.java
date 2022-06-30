class Solution {
    public int[] productExceptSelf(int[] arr) {
        
        int N=arr.length;
        int[] left=new int[N];
        int[] right=new int[N];
        
        int pr=1;
        
        for(int i=0;i<N;i++){
            
            pr*=arr[i];
            left[i]=pr;
        }
        pr=1;
        for(int i=N-1;i>=0;i--){
            
            pr*=arr[i];
            right[i]=pr;
        }
        
        
        System.out.print(Arrays.toString(left));
        System.out.print(Arrays.toString(right));

        int[] ans=new int[N];
        
        ans[0]=right[1];
        ans[N-1]=left[N-2];
        for(int i=1;i<N-1;i++){
            ans[i]=left[i-1]*right[i+1];
        }
       
        
        return ans;
    }
}