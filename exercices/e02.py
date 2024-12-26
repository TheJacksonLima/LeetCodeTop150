from typing import List


#27. Remove Element
def removeElement(self, nums: List[int], val: int) -> int:
    nums[:] = [x for x in nums if x != val]

if __name__ == "__main__":
    nums = [3, 2, 2, 3]
    ret = removeElement(nums)
    print(f"{ret}")