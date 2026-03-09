package com.nyinnovations.dsa

/*
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.

Example 1:
Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]

Example 2:
Input: nums = [0]
Output: [0]*/

fun main() {
    val nums = intArrayOf(0, 1, 0, 3, 12)
    println("Original array: ${nums.contentToString()}")

    // Brute force example (commented out as it modifies the array if not copied)
    // val bruteResult = moveZeroToEndBruteForce(nums.copyOf())
    // println("Modified array (Brute Force): ${bruteResult.contentToString()}")

    val result = moveZeroToEnd(nums)
    println("Modified array (Optimized): ${result.contentToString()}")
}

/**
 * Brute force approach:
 * 1. Create a temporary array of the same size.
 * 2. Copy all non-zero elements to the temporary array.
 * 3. Fill the remaining positions with zeros.
 * 4. Copy the temporary array back to the original array.
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
fun moveZeroToEndBruteForce(nums: IntArray): IntArray {
    val temp = IntArray(nums.size)
    var k = 0
    for (i in nums.indices) {
        if (nums[i] != 0) {
            temp[k++] = nums[i]
        }
    }
    for (i in nums.indices) {
        nums[i] = temp[i]
    }
    return nums
}

/**
 * Optimized approach (Two Pointers):
 * 1. Maintain a pointer 'curIndex' for the next position to fill with a non-zero element.
 * 2. Iterate through the array; if an element is non-zero, put it at 'curIndex' and increment 'curIndex'.
 * 3. After the loop, all non-zero elements are at the beginning. Fill the rest of the array with zeros.
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
fun moveZeroToEnd(nums: IntArray): IntArray {
    var curIndex = 0
    for (num in nums) {
        if (num != 0) {
            nums[curIndex++] = num
        }
    }
    while (curIndex < nums.size) {
        nums[curIndex++] = 0
    }
    return nums
}
