class Solution {
    fun mySqrt(x: Int): Int {
        val sqrt = Math.sqrt(x.toDouble());
        return Math.floor(sqrt).toInt();
    }
}