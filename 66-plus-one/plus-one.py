class Solution:
    def plusOne(self, digits: List[int]) -> List[int]:
        return self.sumRec(digits,len(digits)-1)

    def sumRec(self, d, size):
        if size < 0:
            return [1] + d
        
        sum = d[size] + 1

        if sum>9:
            d[size] = 0
            return self.sumRec(d,size-1)
        
        d[size] = sum
        return d

