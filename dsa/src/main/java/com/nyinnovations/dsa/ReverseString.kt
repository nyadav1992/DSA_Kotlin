package com.nyinnovations.dsa

fun main(){
    // Example usage of the reversedString function
    println(reversedString("hello")) // Output: "olleh"
    println(bruteForceReverse("world")) // Output: "dlrow"
}

/**
 * Optimized approach to reverse a string using StringBuilder.
 * This method iterates over the string in reverse order and appends each character to a StringBuilder.
 *
 * @param s The input string to be reversed.
 * @return The reversed string.
 */
private fun reversedString(s: String): String {
    if (s.length < 2) return s
    val rString = StringBuilder()
    for (i in s.length - 1 downTo 0) {
        rString.append(s[i])
    }
    return rString.toString()
}

/**
 * Brute force approach to reverse a string.
 * This method converts the string to a character array, reverses the array, and then constructs a new string.
 *
 * @param s The input string to be reversed.
 * @return The reversed string.
 */
private fun bruteForceReverse(s: String): String {
    if (s.length < 2) return s
    val charArray = s.toCharArray()
    val reversedArray = CharArray(charArray.size)
    for (i in charArray.indices) {
        reversedArray[i] = charArray[charArray.size - 1 - i]
    }
    return String(reversedArray)
}
