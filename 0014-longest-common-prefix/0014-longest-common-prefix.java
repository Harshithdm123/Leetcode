class Solution {
    public String longestCommonPrefix(String[] strs) {


   if (strs == null || strs.length == 0) {
            return ""; // Return an empty string if the array is empty or null.
        }

        // Take the first string as the reference for comparison.
        String reference = strs[0];
        int minLength = reference.length();

        // Find the minimum length among all strings.
        for (int i = 1; i < strs.length; i++) {
            int len = strs[i].length();
            if (len < minLength) {
                minLength = len;
            }
        }

        // Compare characters of the reference string with other strings.
        for (int i = 0; i < minLength; i++) {
            char currentChar = reference.charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].charAt(i) != currentChar) {
                    return reference.substring(0, i); // Return the common prefix found so far.
                }
            }
        }

        return reference.substring(0, minLength);









        
    }
}