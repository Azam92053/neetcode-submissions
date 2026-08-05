class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // List<List<Integer>> ans = new ArrayList<>();
        HashMap<String, List<String>> ans = new HashMap<>();

        for(String s : strs){
            int[] arr = new int[26];
            for(int i = 0; i < s.length(); i++){
                arr[s.charAt(i) - 'a']++;
            }
            String key = Arrays.toString(arr);
            if(ans.containsKey(key)){
                ans.get(key).add(s);
            }
            else{
                ans.put(key, new ArrayList<>());
                ans.get(key).add(s);
            }
            
        }

        return new ArrayList<>(ans.values());
    }
}
