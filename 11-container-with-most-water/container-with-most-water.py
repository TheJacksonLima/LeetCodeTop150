class Solution:
    def maxArea(self, height: List[int]) -> int:
        pos_begin = 0 
        pos_end = len(height) -1
        max_area = 0

        while pos_end > pos_begin:
            h = min(height[pos_begin],height[pos_end])
            width = pos_end - pos_begin
            area = h * width
            max_area = max(max_area,area)

            if height[pos_begin] > height[pos_end]:
                pos_end-=1
            else:
                pos_begin+=1

        return max_area
                

        