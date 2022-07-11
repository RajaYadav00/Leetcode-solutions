class Solution {
    public int findKthLargest(int[] arr, int k) {
        int N=arr.length;
        
        for(int i=0;i<N;i++){
            
            for(int j=0;j<N-1-i;j++){
                
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        
        System.out.print(Arrays.toString(arr));
        return arr[N-k];
    }
}