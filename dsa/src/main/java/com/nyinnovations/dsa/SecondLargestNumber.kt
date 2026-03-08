package com.nyinnovations.dsa

/*
Find Second Largest Element in Array

Problem:
Input: [10, 5, 20, 8]
Output: 10
*/

fun main() {
    val nums = intArrayOf(1, 5, 9, 11, 45, 2, 43, 67)
    println("Second Largest Number (Optimized): ${secondLargestNumber(nums)}")
    println("Second Largest Number (Brute Force): ${bruteForceSecondLargestNumber(nums)}")
}

/**
 * Optimized approach to find the second largest number in an array.
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * @param nums The input array of integers.
 * @return The second largest number in the array.
 */
private fun secondLargestNumber(nums: IntArray): Int {
    var secondLarge = Int.MIN_VALUE
    var large = Int.MIN_VALUE

    for (i in nums) {
        if (i > large) {
            secondLarge = large
            large = i
        } else if (i > secondLarge && i != large) {
            secondLarge = i
        }
    }
    return secondLarge
}

/**
 * Brute force approach to find the second largest number in an array.
 * Time Complexity: O(n^2)
 * Space Complexity: O(1)
 *
 * @param nums The input array of integers.
 * @return The second largest number in the array.
 */
private fun bruteForceSecondLargestNumber(nums: IntArray): Int {
    var largest = Int.MIN_VALUE
    for (i in nums) {
        if (i > largest) {
            largest = i
        }
    }

    var secondLargest = Int.MIN_VALUE
    for (i in nums) {
        if (i > secondLargest && i < largest) {
            secondLargest = i
        }
    }
    return secondLargest
}
