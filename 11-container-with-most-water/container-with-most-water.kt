class Solution {
    fun maxArea(height: IntArray): Int {
        var posBegin = 0
        var posEnd = height.size - 1
        var maxArea = 0
        
        while (posEnd>posBegin){
            val distance = posEnd - posBegin
            val h = minOf(height[posBegin],height[posEnd])
            val area = h * distance
        
            maxArea = maxOf(maxArea,area)

            if (height[posEnd] > height[posBegin]){
                posBegin+=1
            }
            else{
                posEnd-=1
            }
        }

        return maxArea
        
    }
}