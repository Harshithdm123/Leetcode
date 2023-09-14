class Solution {
    public int lengthOfLastWord(String s) {
   // Trim leading and trailing spaces
        s = s.trim();

        // Split the trimmed string into words using space as the delimiter
        String[] words = s.split(" ");

        // If there are no words, return 0
        if (words.length == 0) {
            return 0;
        }

        // Return the length of the last word
        return words[words.length - 1].length();






        
    }
}