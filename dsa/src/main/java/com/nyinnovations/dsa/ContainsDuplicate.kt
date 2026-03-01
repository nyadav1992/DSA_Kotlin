package com.nyinnovations.dsa

/**
 * Given an integer array nums, return true if any value appears more than once in the array,
 * otherwise return false.
 *
 * Example 1:
 * Input: nums = [1,2,3,1]
 * Output: true
 *
 * Example 2:
 * Input: nums = [1,2,3,4]
 * Output: false
 *
 * Example 3:
 * Input: nums = [1,1,1,3,3,4,3,2,4,2]
 * Output: true
 *
 * [LeetCode Link](https://leetcode.com/problems/contains-duplicate/)
 */

fun main() {
    val nums = intArrayOf(1, 2, 3, 4, 5, 2)
    println("Brute Force Approach: ${isContainsDuplicate(nums)}")
    println("Optimized Approach: ${isContainsDuplicateOptimize(nums)}")
}

/**
 * Brute Force Approach
 *
 * Compares each element with every other element in the array.
 *
 * Time Complexity: O(n^2) - due to nested loops.
 * Space Complexity: O(1) - no extra space used.
 *
 * @param nums The integer array to check.
 * @return True if any value appears more than once, false otherwise.
 */
private fun isContainsDuplicate(nums: IntArray): Boolean {
    if (nums.size <= 1) return false
    for (i in nums.indices) {
        for (j in i + 1..<nums.size) {
            if (nums[i] == nums[j]) return true
        }
    }
    return false
}

/**
 * Optimized Approach
 *
 * Uses a HashSet to store visited elements and check for duplicates in a single pass.
 *
 * Time Complexity: O(n) - single pass through the array.
 * Space Complexity: O(n) - to store elements in the set.
 *
 * @param nums The integer array to check.
 * @return True if any value appears more than once, false otherwise.
 */
private fun isContainsDuplicateOptimize(nums: IntArray): Boolean {
    if (nums.size <= 1) return false
    val set = mutableSetOf<Int>()
    for (i in nums) {
        if (set.contains(i)) return true
        set.add(i)
    }
    return false
}
