from typing import List


#26. Remove Duplicates from Sorted Array
def removeDuplicates(self, nums: List[int]) -> int:
    listSize = len(nums)
    for i in range(listSize):

        if i == listSize:
            break

        if (nums[i] in nums[i + 1:]):
            val = nums[i]
            nums[:] = [x for x in nums if x != nums[i]]
            nums.insert(i, val)
            listSize = len(nums)

if __name__ == "__main__":
    nums = [0, 0, 1, 1, 1, 2, 2, 3, 3, 4]
    ret = removeDuplicates(nums)
    print(f"{ret}")
