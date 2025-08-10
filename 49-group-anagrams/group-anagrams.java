class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       
       //Set<Character> new TreeSet<>();
       int qtdStrings = strs.length;
       HashMap<String,List<String>> mapStrs = new HashMap<>();

       for(String s: strs){
            char[] a = s.toCharArray();
            Arrays.sort(a);
            String key = new String(a);
            mapStrs.computeIfAbsent(key,k -> new ArrayList<>()).add(s);
       }

    return new ArrayList<>(mapStrs.values());
    }

}