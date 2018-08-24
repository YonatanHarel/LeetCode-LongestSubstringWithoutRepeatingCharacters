/*
Longest Substring Without Repeating Characters

Given a string, find the length of the longest substring without repeating characters.

Example 1:

        Input: "abcabcbb"
        Output: 3
        Explanation: The answer is "abc", which the length is 3.
        Example 2:

        Input: "bbbbb"
        Output: 1
        Explanation: The answer is "b", with the length of 1.
        Example 3:

        Input: "pwwkew"
        Output: 3
        Explanation: The answer is "wke", with the length of 3.
        Note that the answer must be a substring, "pwke" is a subsequence and not a substring.

        Complexity:
        space - O(1) no extra space is required
        time - O(n) we are passing once on each element
 */

public class Main {
    public static int lengthOfLongestSubstring(String s) {
        char[] strArray = s.toCharArray();
        if (strArray.length == 0) {
            return 0;
        }

        String subString;

        int startIndex = 0;
        int runIndex = startIndex + 1;
        subString = String.valueOf(strArray[startIndex]);
        int maxLength = subString.length();
        while (startIndex < strArray.length && runIndex < strArray.length) {
            if (subString.indexOf(strArray[runIndex]) >= 0) {
                startIndex = runIndex;
                runIndex = startIndex + 1;
                subString = String.valueOf(strArray[startIndex]);
            } else {
                subString += String.valueOf(strArray[runIndex++]);
            }
            if (maxLength < subString.length()) {
                maxLength = subString.length();
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        String s1 = "bbbbb";
        String s2 = "pwwkew";
        String s3 = "";
        String s4 = " ";
        String s5 = "au";
        int output = lengthOfLongestSubstring(s);
        System.out.println("substring 'abcabcbb' length: " + output);

        output = lengthOfLongestSubstring(s1);
        System.out.println("substring 'bbbbb' length: " + output);

        output = lengthOfLongestSubstring(s2);
        System.out.println("substring 'pwwkew' length: " + output);

        output = lengthOfLongestSubstring(s3);
        System.out.println("substring '' length: " + output);

        output = lengthOfLongestSubstring(s4);
        System.out.println("substring ' ' length: " + output);

        output = lengthOfLongestSubstring(s5);
        System.out.println("substring 'au' length: " + output);

        System.out.println("===================================================");
//
//        int output = lengthOfLongestSubstring_site(s);
//        System.out.println("substring 'abcabcbb' length: " + output);
//
//        output = lengthOfLongestSubstring_site(s1);
//        System.out.println("substring 'bbbbb' length: " + output);
//
//        output = lengthOfLongestSubstring_site(s2);
//        System.out.println("substring 'pwwkew' length: " + output);
//
//        output = lengthOfLongestSubstring_site(s3);
//        System.out.println("substring '' length: " + output);
//
//        output = lengthOfLongestSubstring_site(s4);
//        System.out.println("substring ' ' length: " + output);
//
//        output = lengthOfLongestSubstring_site(s5);
//        System.out.println("substring 'au' length: " + output);
    }
}
