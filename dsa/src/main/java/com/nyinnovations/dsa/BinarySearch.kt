package com.nyinnovations.dsa

/*
You are given an array of distinct integers nums, sorted in ascending order, and an integer target.

Implement a function to search for target within nums. If it exists, then return its index, otherwise, return -1.

Example 1:
Input: nums = [-1,0,2,4,6,8], target = 4
Output: 3

Example 2:
Input: nums = [-1,0,2,4,6,8], target = 3
Output: -1
*/

fun main() {
    val nums = intArrayOf(-1, 0, 2, 4, 6, 8)
    val target = 4
    
    println("Original array: ${nums.contentToString()}")
    println("Target: $target")

    val bruteResult = linearSearch(nums, target)
    println("Result (Brute Force - Linear Search): $bruteResult")

    val optimizedResult = binarySearch(nums, target)
    println("Result (Optimized - Binary Search): $optimizedResult")
}

/**
 * Brute force approach: Linear Search
 * 1. Iterate through the array one element at a time.
 * 2. Compare each element with the target.
 * 3. Return the index if found, otherwise return -1.
 *
 * Time Complexity: O(n) - We might have to check every element.
 * Space Complexity: O(1) - No extra space used.
 */
private fun linearSearch(nums: IntArray, target: Int): Int {
    for (i in nums.indices) {
        if (nums[i] == target) {
            return i
        }
    }
    return -1
}

/**
 * Optimized approach: Binary Search
 * 1. Use two pointers, left and right, to represent the search range.
 * 2. Calculate the middle index.
 * 3. If the middle element is the target, return the index.
 * 4. If the middle element is less than the target, narrow the range to the right half.
 * 5. If the middle element is greater than the target, narrow the range to the left half.
 *
 * Time Complexity: O(log n) - The search space is halved in each step.
 * Space Complexity: O(1) - No extra space used.
 */
private fun binarySearch(nums: IntArray, target: Int): Int {
    var left = 0
    var right = nums.size - 1

    while (left <= right) {
        // mid calculation avoids potential overflow for very large arrays
        val mid = left + (right - left) / 2

        when {
            nums[mid] == target -> return mid
            nums[mid] < target -> left = mid + 1
            else -> right = mid - 1
        }
    }

    return -1
}
