package com.nyinnovations.dsa

/*
Find the Largest Element in Array

Problem:
Input: [3, 7, 2, 9, 5]
Output: 9
*/

fun main() {
    val nums = intArrayOf(1,4,9,4,7,12,4,6)
    println("Largest Number (Optimized): ${largestNumber(nums)}")
    println("Largest Number (Brute Force): ${bruteForceLargestNumber(nums)}")
}

/**
 * Optimized approach to find the largest number in an array.
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * @param nums The input array of integers.
 * @return The largest number in the array.
 */
private fun largestNumber(nums: IntArray): Int {
    var largestNum = Int.MIN_VALUE
    for (i in nums) {
        if (i > largestNum) {
            largestNum = i
        }
    }
    return largestNum
}

/**
 * Brute force approach to find the largest number in an array.
 * Time Complexity: O(n^2)
 * Space Complexity: O(1)
 *
 * @param nums The input array of integers.
 * @return The largest number in the array.
 */
private fun bruteForceLargestNumber(nums: IntArray): Int {
    for (i in nums) {
        var isLargest = true
        for (j in nums) {
            if (j > i) {
                isLargest = false
                break
            }
        }
        if (isLargest) return i
    }
    return Int.MIN_VALUE
}
