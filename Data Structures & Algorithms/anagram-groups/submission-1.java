class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // List<List<Integer>> ans = new ArrayList<>();
        HashMap<String, List<String>> ans = new HashMap<>();

        for(String s : strs){
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);

            ans.putIfAbsent(key, new ArrayList<>());
            ans.get(key).add(s);            
        }
        
        return new ArrayList<>(ans.values());
    }
}
