class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> freq = new HashMap<>();
        for(int num: nums){
            freq.put(num,freq.getOrDefault(num,0) + 1);
        }
       int[]  topK = freq.entrySet()
                                 .stream()
                                 .sorted(Map.Entry.<Integer,Integer>comparingByValue().reversed())
                                 .limit(k)
                                 .map(Map.Entry::getKey)
                                 .mapToInt(Integer::intValue)
                                 .toArray();
                             //    .collect(Collectors.toList());
        
        //System.out.println(topK);
        return topK;
    }
}