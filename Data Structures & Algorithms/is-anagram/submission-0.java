class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        int[] allchar = new int[26];

        for(int i = 0; i < s.length(); i++){
            allchar[s.charAt(i) - 'a']++;
            allchar[t.charAt(i) - 'a']--;
        }

        for(int i = 0; i < 26; i++){
            if(allchar[i] > 0) return false;
        }
        return true;
    }
}
