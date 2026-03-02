package com.nyinnovations.dsa

/**
 * Given two strings s and t, return true if the two strings are anagrams of each other,
 * otherwise return false.
 *
 * An anagram is a string that contains the exact same characters as another string,
 * but the order of the characters can be different.
 *
 * Example 1:
 * Input: s = "racecar", t = "carrace"
 * Output: true
 *
 * Example 2:
 * Input: s = "jar", t = "jam"
 * Output: false
 *
 * [LeetCode Link](https://leetcode.com/problems/valid-anagram/)
 */

fun main() {
    val s = "racecar"
    val t = "carrace"
    println("Brute Force Approach: ${isValidAnagram(s, t)}")
    println("Optimized Approach: ${isValidAnagramOptimize(s, t)}")
}

/**
 * Brute Force Approach
 *
 * Sorting both strings and comparing them. If they are anagrams, their sorted
 * versions will be identical.
 *
 * Time Complexity: O(n log n) - due to the sorting algorithm.
 * Space Complexity: O(n) - to store the character arrays of the strings.
 *
 * @param s The first string.
 * @param t The second string.
 * @return True if t is an anagram of s, false otherwise.
 */
private fun isValidAnagram(s: String, t: String): Boolean {
    if (s.length != t.length) return false
    val sChars = s.toCharArray()
    val tChars = t.toCharArray()
    sChars.sort()
    tChars.sort()
    return sChars.contentEquals(tChars)
}

/**
 * Optimized Approach
 *
 * Uses a frequency map (or frequency array) to count character occurrences.
 * We increment for string s and decrement for string t. If all counts are zero, they are anagrams.
 *
 * Time Complexity: O(n) - single pass through both strings.
 * Space Complexity: O(k) - where k is the number of unique characters (max 26 for lowercase English).
 *
 * @param s The first string.
 * @param t The second string.
 * @return True if t is an anagram of s, false otherwise.
 */
private fun isValidAnagramOptimize(s: String, t: String): Boolean {
    if (s.length != t.length) return false

    val countMap = mutableMapOf<Char, Int>()

    for (i in s.indices) {
        countMap[s[i]] = countMap.getOrDefault(s[i], 0) + 1
        countMap[t[i]] = countMap.getOrDefault(t[i], 0) - 1
    }

    // If all character counts are 0, it's a valid anagram
    return countMap.values.all { it == 0 }
}
