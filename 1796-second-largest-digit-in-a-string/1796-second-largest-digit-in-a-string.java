class Solution {
    public int secondHighest(String s) {
        
        // char[] arr=s.toCharArray();
        //     System.out.print(arr);
        int second=-1;
        int first=-1;
        for(int i=0;i<s.length();i++){
            
            if(Character.isDigit(s.charAt(i))){
                
                if(Character.getNumericValue(s.charAt(i))>first){
                    second=first;
                    first=Character.getNumericValue(s.charAt(i));
                }
                    
                else if(Character.getNumericValue(s.charAt(i))>second &&Character.getNumericValue(s.charAt(i))!=first){
                    second=Character.getNumericValue(s.charAt(i));
                }
            }
        }
        return second;
    }
}