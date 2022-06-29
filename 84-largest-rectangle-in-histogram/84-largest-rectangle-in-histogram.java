class Solution {
    public int largestRectangleArea(int[] heights) {
        
        
        int[] leftb=new int[heights.length];
        
        Stack<Integer> st=new Stack<>();
        
        // st.push(heights.length - 1);
        
        // leftb[heights.length-1]=heights.length;
        
        for(int i=heights.length-1;i>=0;i--){
            
            while(st.size()>0 && heights[i]<=heights[st.peek()]){
                st.pop();
            }
            if(st.size()==0){
                leftb[i]=heights.length;
            }
            else{
                leftb[i]=st.peek();
            }
            
            st.push(i);
        }
        
      // _______________________________________________________
         int[] rightb=new int[heights.length];
        
        Stack<Integer> st2=new Stack<>();
        
        // rightb[0]=-1;
        
        for(int i=0;i<heights.length;i++){
            
            while(st2.size()>0 && heights[i]<=heights[st2.peek()]){
                st2.pop();
            }
            if(st2.size()==0){
                rightb[i]=(-1);
            }
            else{
                rightb[i]=(st2.peek());
            }
            
            st2.push(i);
        }
        
        // ____________________________________________________________
    
        
        int max=0;
        for(int i=0;i<heights.length;i++){
            
            int width=(leftb[i]-rightb[i])-1;
            int area=heights[i] * width;
            max=Math.max(area,max);
            
            // System.out.print(rightb[i]);
        }
        
        // System.out.print(max);
        return max;
    }   
}