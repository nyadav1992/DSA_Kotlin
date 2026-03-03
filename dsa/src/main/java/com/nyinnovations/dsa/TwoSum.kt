package com.nyinnovations.dsa

/*
This program demonstrates two approaches to solving the Two Sum problem:
1. Brute Force Approach: A straightforward method that checks all possible pairs of numbers.
2. Optimize Approach: A more efficient method using a HashMap to store and retrieve indices.

The Two Sum problem is defined as follows:
Given an array of integers nums and an integer target, return the indices i and j such that nums[i] + nums[j] == target and i != j.
You may assume that every input has exactly one pair of indices i and j that satisfy the condition.

Return the answer with the smaller index first.
*/

fun main() {
    val nums = intArrayOf(3, 4, 5, 1, 7, 2, 9, 8)
    val target = 5
    println("Brute Force Approach: ${twoSumBruteForce(nums, target).contentToString()}")
    println("Optimize Approach: ${twoSumOptimize(nums, target).contentToString()}")
}

// Brute Force Approach: Iterates through all pairs of numbers to find the solution.
private fun twoSumBruteForce(nums: IntArray, target: Int): IntArray {
    for (i in nums.indices) {
        for (j in i + 1 until nums.size) { // Corrected the range to avoid out-of-bounds error.
            if (nums[i] + nums[j] == target) {
                return intArrayOf(i, j)
            }
        }
    }
    return intArrayOf()
}

// Optimize Approach: Uses a HashMap to store indices of numbers for quick lookup.
private fun twoSumOptimize(nums: IntArray, target: Int): IntArray {
    val map = mutableMapOf<Int, Int>()
    for (i in nums.indices) {
        val complement = target - nums[i]
        if (map.containsKey(complement)) {
            return intArrayOf(map[complement]!!, i)
        }
        map[nums[i]] = i
    }
    return intArrayOf()
}