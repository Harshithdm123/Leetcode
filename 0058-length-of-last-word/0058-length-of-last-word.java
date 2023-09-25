class Solution {
    public int lengthOfLastWord(String s) {
    String str = s.trim();
        int count = 0 ;
        // for loop from last index to first
        for(int i = str.length()-1 ;i>=0;i--){
            // keep increasing the counter untill we find any blank space
            if(str.charAt(i) != ' ' ){
                count++ ;
            }
            // once the blank space is found break the loop
            else {
                break ;
            }
        }
        return count ; 
        


        
    }
}