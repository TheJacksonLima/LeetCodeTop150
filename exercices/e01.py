from typing import List

#https://leetcode.com/problems/merge-sorted-array?envType=study-plan-v2&envId=top-interview-150
#88. Merge Sorted Array
def merge(nums1: List[int], m: int, nums2: List[int], n: int) -> None:
    """
    Do not return anything, modify nums1 in-place instead.
    """
    k = i = 0
    while i < m:
        print(f"lista : {nums1}")
        print(f"i={i}\n n1 : {i},{nums1[i]}")
        if nums1[i] == 0:
            nums1.pop(i)
            continue

        for j in range(k, n):
            print(f"k = {k}\nn2 : {j},{nums2[j]}")
            if (nums2[j] == nums1[i]):
                nums1.insert(i,nums2[j])
                i=i+1
                m=m+1
                k=k+1
                break
            if (nums2[j] < nums1[i]):
                nums1.insert(i,nums2[j])
                k=k+1
                m=m+1
                break
            elif nums1[i] < nums2[j]:
                break
        i=i+1

    nums1[:] = nums1[:m]+nums2[k:n]

if __name__ == "__main__":
    nums1 = [4,5,6,0,0,0]
    m = 3
    nums2 = [1,2,3]
    n = 3
    merge(nums1,m,nums2,n)
    print(nums1)
