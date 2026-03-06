package com.nyinnovations.dsa

/*
Longest Substring Without Repeating Characters

Example
Input:
"abcabcbb"

Output:
3 ("abc")
*/

fun main() {
    val s = "abcdeabcbb"
    val s1 = "zxyzxyz"
    val s2 = "xxxx"
    val s3 = "au"
    val s4 = "dvdf"
    println("longestSubstringWithoutRepeatingCharacters: ${longestSubstringWithoutRepeatingCharacters(s4)}")
    println("bruteForceLongestSubstring: ${bruteForceLongestSubstring(s4)}")
}

/**
 * Optimized approach using sliding window and a set to track characters.
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 *
 * @param s The input string.
 * @return The length of the longest substring without repeating characters.
 */
private fun longestSubstringWithoutRepeatingCharacters(s: String): Int {
    val set = mutableSetOf<Char>()
    var left = 0
    var max = 0

    for (right in s.indices) {
        while (set.contains(s[right])) {
            set.remove(s[left])
            left++
        }
        set.add(s[right])
        max = maxOf(max, right - left + 1)
    }
    return max
}

/**
 * Brute force approach to find the longest substring without repeating characters.
 * Time Complexity: O(n^3)
 * Space Complexity: O(n)
 *
 * @param s The input string.
 * @return The length of the longest substring without repeating characters.
 */
private fun bruteForceLongestSubstring(s: String): Int {
    var max = 0

    for (i in s.indices) {
        val set = mutableSetOf<Char>()
        for (j in i until s.length) {
            if (set.contains(s[j])) break
            set.add(s[j])
            max = maxOf(max, j - i + 1)
        }
    }
    return max
}
