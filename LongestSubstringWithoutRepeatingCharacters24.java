// https://www.codingninjas.com/studio/problems/longest-substring-without-repeating-characters_8230684?challengeSlug=striver-sde-challenge&leftPanelTab=0

/*
 * Use any data structure like map, array, set to maintain the count of alphabets in the substring
 * If the count of alphabet is equal to zero, increment the end pointer and the count of the alphabet
 * Update the answer by taking the max of ans and the current length of the substring
 * If the count of alphabet is already more than zero, increment the start pointer and decrement the count of the alphabet
 */

public class LongestSubstringWithoutRepeatingCharacters24 {
    public static int uniqueSubstrings(String s) {
        int n = s.length();
        int[] count = new int[26];
        int ans = 0;

        int start = 0;
        int end = 0;

        while (end < n) {
            if (count[s.charAt(end) - 'a'] == 0) {
                count[s.charAt(end) - 'a']++;
                end++;
                ans = Math.max(ans, end - start);
            } else {
                count[s.charAt(start) - 'a']--;
                start++;
            }
        }

        return ans;
    }
}
