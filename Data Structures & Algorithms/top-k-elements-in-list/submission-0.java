class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer, Integer> freq = new HashMap<>();
        for(int num : nums){
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        List<Integer> bucket[] = new List[n + 1];
        for(int i = 0; i < n + 1; i++){
            bucket[i] = new ArrayList<>();
        }

        for(Map.Entry<Integer, Integer> entry : freq.entrySet()){
            bucket[entry.getValue()].add(entry.getKey());
        }

        int[] res = new int[k];

        int index = 0; 
         for (int i = bucket.length - 1; i > 0 && index < k; i--) {
            for (int j : bucket[i]) {
                res[index++] = j;
                if (index == k) {
                    return res;
                }
            }
        } 
        return res;    
    }
}
