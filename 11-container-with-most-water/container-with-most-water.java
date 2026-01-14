class Solution {
    public int maxArea(int[] height) {
        int posBegin = 0;
        int posEnd = height.length - 1;
        int maxArea = 0;
        int distance, h, area;
        
        while (posEnd>posBegin){
            distance = posEnd - posBegin;
            h = Integer.min(height[posBegin],height[posEnd]);
            area = h * distance;
            maxArea = Math.max(maxArea,area);

            if (height[posEnd] > height[posBegin]){
                posBegin+=1;
            }
            else{
                posEnd-=1;
            }
        }

        return maxArea;
    }
}