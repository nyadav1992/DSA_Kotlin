package com.nyinnovations.dsa

import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

/**
 * Unit tests for PalindromeString.kt
 *
 * We test both approaches (brute force & optimized) with the same
 * set of inputs — they should always agree on the result.
 *
 * Test categories:
 *  1. Classic palindromes          — should return true
 *  2. Non-palindromes              — should return false
 *  3. Edge cases                   — empty string, single char, etc.
 *  4. Case sensitivity             — "Racecar" ≠ "racecar" (no normalisation)
 *  5. Palindromes with spaces/nums — depends on whether we care about them
 */
class PalindromeStringTest {

    // ─── 1. Classic palindromes ───────────────────────────────────────────────

    @Test
    fun `brute force - racecar is a palindrome`() {
        assertTrue(isBruteForcePalindrome("racecar"))
    }

    @Test
    fun `optimized - racecar is a palindrome`() {
        assertTrue(isOptimizedPalindrome("racecar"))
    }

    @Test
    fun `brute force - madam is a palindrome`() {
        assertTrue(isBruteForcePalindrome("madam"))
    }

    @Test
    fun `optimized - madam is a palindrome`() {
        assertTrue(isOptimizedPalindrome("madam"))
    }

    @Test
    fun `brute force - abcba is a palindrome`() {
        assertTrue(isBruteForcePalindrome("abcba"))
    }

    @Test
    fun `optimized - abcba is a palindrome`() {
        assertTrue(isOptimizedPalindrome("abcba"))
    }

    @Test
    fun `brute force - abba is a palindrome`() {
        // even-length palindrome
        assertTrue(isBruteForcePalindrome("abba"))
    }

    @Test
    fun `optimized - abba is a palindrome`() {
        assertTrue(isOptimizedPalindrome("abba"))
    }

    // ─── 2. Non-palindromes ───────────────────────────────────────────────────

    @Test
    fun `brute force - hello is not a palindrome`() {
        assertFalse(isBruteForcePalindrome("hello"))
    }

    @Test
    fun `optimized - hello is not a palindrome`() {
        assertFalse(isOptimizedPalindrome("hello"))
    }

    @Test
    fun `brute force - kotlin is not a palindrome`() {
        assertFalse(isBruteForcePalindrome("kotlin"))
    }

    @Test
    fun `optimized - kotlin is not a palindrome`() {
        assertFalse(isOptimizedPalindrome("kotlin"))
    }

    @Test
    fun `brute force - abc is not a palindrome`() {
        assertFalse(isBruteForcePalindrome("abc"))
    }

    @Test
    fun `optimized - abc is not a palindrome`() {
        assertFalse(isOptimizedPalindrome("abc"))
    }

    // ─── 3. Edge cases ────────────────────────────────────────────────────────

    @Test
    fun `brute force - empty string is a palindrome`() {
        // An empty string trivially reads the same forwards and backwards
        assertTrue(isBruteForcePalindrome(""))
    }

    @Test
    fun `optimized - empty string is a palindrome`() {
        assertTrue(isOptimizedPalindrome(""))
    }

    @Test
    fun `brute force - single character is always a palindrome`() {
        assertTrue(isBruteForcePalindrome("a"))
        assertTrue(isBruteForcePalindrome("z"))
    }

    @Test
    fun `optimized - single character is always a palindrome`() {
        assertTrue(isOptimizedPalindrome("a"))
        assertTrue(isOptimizedPalindrome("z"))
    }

    @Test
    fun `brute force - two same characters is a palindrome`() {
        assertTrue(isBruteForcePalindrome("aa"))
    }

    @Test
    fun `optimized - two same characters is a palindrome`() {
        assertTrue(isOptimizedPalindrome("aa"))
    }

    @Test
    fun `brute force - two different characters is not a palindrome`() {
        assertFalse(isBruteForcePalindrome("ab"))
    }

    @Test
    fun `optimized - two different characters is not a palindrome`() {
        assertFalse(isOptimizedPalindrome("ab"))
    }

    // ─── 4. Case sensitivity ──────────────────────────────────────────────────

    @Test
    fun `brute force - Racecar with capital R is NOT a palindrome (case sensitive)`() {
        // Our functions don't normalise case, so 'R' != 'r'
        assertFalse(isBruteForcePalindrome("Racecar"))
    }

    @Test
    fun `optimized - Racecar with capital R is NOT a palindrome (case sensitive)`() {
        assertFalse(isOptimizedPalindrome("Racecar"))
    }

    // ─── 5. Numbers & special characters ─────────────────────────────────────

    @Test
    fun `brute force - numeric palindrome 12321`() {
        assertTrue(isBruteForcePalindrome("12321"))
    }

    @Test
    fun `optimized - numeric palindrome 12321`() {
        assertTrue(isOptimizedPalindrome("12321"))
    }

    @Test
    fun `brute force - numeric non-palindrome 12345`() {
        assertFalse(isBruteForcePalindrome("12345"))
    }

    @Test
    fun `optimized - numeric non-palindrome 12345`() {
        assertFalse(isOptimizedPalindrome("12345"))
    }
}

