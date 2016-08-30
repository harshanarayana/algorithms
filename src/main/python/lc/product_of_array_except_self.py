class Solution(object):
    def productExceptSelf(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        res = [1] * len(nums)
        for i in range(1, len(nums)):
            res[i] = res[i - 1] * nums[i - 1]
            
        right = 1 # store the accumulated sum of right subarray
        for i in range(len(nums) - 1, -1, -1):
            res[i] *= right
            right *= nums[i]
            
        return res