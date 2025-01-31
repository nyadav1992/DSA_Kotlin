package com.nyinnovations.dsa

fun main() {
    val testCases = listOf("racecar", "hello", "madam", "kotlin", "abcba", "")

    println("===== Palindrome String Checker =====\n")

    for (word in testCases) {
        val bruteResult = isBruteForcePalindrome(word)
        val optimizedResult = isOptimizedPalindrome(word)
        println("\"$word\"")
        println("  Brute Force  -> $bruteResult")
        println("  Optimized    -> $optimizedResult")
        println()
    }
}

/**
 * BRUTE FORCE APPROACH
 *
 * Idea: Reverse the entire string and compare it with the original.
 * If both are equal, it's a palindrome.
 *
 * How it works:
 *  - We build a reversed version of the string character by character.
 *  - Then we simply check if reversed == original.
 *
 * Time Complexity  : O(n) — we traverse the string once to reverse it
 * Space Complexity : O(n) — we create a new reversed string of the same length
 *
 * Downside: We use extra memory to store the reversed string,
 * which is unnecessary since we don't actually need the full reversed copy.
 */
private fun isBruteForcePalindrome(s: String): Boolean {
    // Edge case: empty string or single character is always a palindrome
    if (s.length <= 1) return true

    // Reverse the string using Kotlin's built-in reversed()
    // Under the hood this creates a brand new String — hence O(n) space
    val reversed = s.reversed()

    // A string is a palindrome if it reads the same forwards and backwards
    return s == reversed
}

/**
 * OPTIMIZED APPROACH (Two Pointer)
 *
 * Idea: Instead of reversing the whole string, we use two pointers —
 * one starting from the left and one from the right — and walk them
 * towards the centre. If any pair of characters doesn't match, it's
 * not a palindrome. We stop as soon as the pointers meet in the middle.
 *
 * How it works:
 *  - left  starts at index 0 (first character)
 *  - right starts at index n-1 (last character)
 *  - At each step, compare s[left] with s[right]
 *  - If they differ → NOT a palindrome, return false immediately
 *  - If they match  → move left forward and right backward
 *  - If the pointers cross → every pair matched → it IS a palindrome
 *
 * Time Complexity  : O(n/2) → simplified to O(n)
 * Space Complexity : O(1) — no extra data structure needed, just two index variables
 *
 * Why is this better? We skip unnecessary work — we only check half the string,
 * and we bail out early the moment we find a mismatch.
 */
private fun isOptimizedPalindrome(s: String): Boolean {
    // Edge case: empty string or single character is always a palindrome
    if (s.length <= 1) return true

    var left = 0
    var right = s.length - 1

    // Keep comparing characters from both ends until the pointers meet
    while (left < right) {
        // Mismatch found — no need to check further, it's not a palindrome
        if (s[left] != s[right]) return false

        // Characters matched, move both pointers inward
        left++
        right--
    }

    // All character pairs matched — it's a palindrome!
    return true
}

