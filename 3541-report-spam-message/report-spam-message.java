class Solution {
    public boolean reportSpam(String[] message, String[] bannedWords) {
        Set<String> banned = new HashSet<>(Arrays.asList(bannedWords));

        long count = Arrays.stream(message)
                          .parallel()
                          .filter(banned::contains)
                          .count();
        return count >=2;
    }
}