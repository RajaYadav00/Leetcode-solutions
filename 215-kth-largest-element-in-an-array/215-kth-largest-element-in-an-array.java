class Solution {
    public int findKthLargest(int[] arr, int k) {
      
        Queue<Integer> q=new PriorityQueue<>();
        
        for(int i=0;i<arr.length;i++){
            
            if(q.size()<k){
                q.add(arr[i]);
            }
            else{
                if(q.peek()<arr[i]){
                    q.remove();
                    q.add(arr[i]);
                }
            }
        }
        return q.peek();
    }
}