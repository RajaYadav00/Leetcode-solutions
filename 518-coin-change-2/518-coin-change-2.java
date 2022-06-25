class Solution {
    public int change(int amount, int[] coins) {
       
        int[] dp=new int[amount+1];
        dp[0]=1;
        
        for(int coin:coins){
        
        for(int amt=1;amt<=amount;amt++){
            
            
                
                if(coin <= amt){
                    
                    int ramt=amt-coin;
                    
                    dp[amt]+=dp[ramt];
                }
            }
        }
        
        return dp[amount];
    }
}