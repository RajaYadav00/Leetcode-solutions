class Solution {
    public int[][] generateMatrix(int n) {
        
          
    int[][] matrix=new int[n][n];
    
    int left=0;
    int top=0;
    int right=n-1;
    int bottom=n-1;
    int value=1;
    while(left<n && right<n){
        
        for(int i=left;i<=right;i++){
            
            matrix[top][i]=value++;
        }
        top++;
        
        for(int i=top;i<=bottom;i++){
            matrix[i][right]=value++;
        }
        right--;
        
        for(int i=right;i>=left;i--){
            matrix[bottom][i]=value++;
        }
        bottom--;
        
        for(int i=bottom;i>=top;i--){
            
            matrix[i][left]=value++;
        }
        
        left++;
    }
    return matrix;
    }
}