class Solution {
    fun isPalindrome(s: String): Boolean {
        val clean_s = s.filter{it.isLetterOrDigit()}.lowercase()
        return clean_s ==  clean_s.reversed()
    }
}