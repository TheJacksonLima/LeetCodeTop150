import math
class Solution:
    def mySqrt(self, x: int) -> int:
        sqrt = math.sqrt(x)
        return math.floor(sqrt)
        