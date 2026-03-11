# DSA in Kotlin

My personal DSA practice repo. The goal is to solve at least 1–2 problems every week, and for each problem I want to write both a brute force solution and an optimized one — so I actually understand the *why* behind the better approach, not just copy the optimal answer.

All solutions are in Kotlin and each file is a standalone runnable program with a `main()` that prints results for a few test cases.

---

## How each solution is structured

Every file follows the same pattern:

- **Brute force function** — the obvious first approach, usually simpler but less efficient
- **Optimized function** — the better solution with explanation of what changed and why
- **Alternative brute force function** — an additional brute force implementation for comparison
- **KDoc comments** on all functions with the approach, time complexity, space complexity, and tradeoffs
- **`main()`** that runs all approaches on the same test cases so you can see the outputs side by side
- **Unit tests** in `test/` for all approaches

---

## Problems solved

### Arrays

| # | Problem | Brute Force | Optimized | File |
|---|---------|-------------|-----------|------|
| 1 | Contains Duplicate | Nested loops — O(n²) time, O(1) space | HashSet — O(n) time, O(n) space | [`ContainsDuplicate.kt`](dsa/src/main/java/com/nyinnovations/dsa/ContainsDuplicate.kt) |
| 6 | Find the Largest Element in Array | Brute force — O(n^2) time, O(1) space | Iterative comparison — O(n) time, O(1) space | [`FindLargestNumber.kt`](dsa/src/main/java/com/nyinnovations/dsa/FindLargestNumber.kt) |
| 7 | Find Second Largest Element in Array | Brute force — O(n^2) time, O(1) space | Iterative comparison — O(n) time, O(1) space | [`SecondLargestNumber.kt`](dsa/src/main/java/com/nyinnovations/dsa/SecondLargestNumber.kt) |
| 8 | Move All Zeros to End | Temporary array — O(n) time, O(n) space | Two pointers — O(n) time, O(1) space | [`MoveAllZerosToEnd.kt`](dsa/src/main/java/com/nyinnovations/dsa/MoveAllZerosToEnd.kt) |
| 9 | Binary Search | Linear search — O(n) time, O(1) space | Binary search — O(log n) time, O(1) space | [`BinarySearch.kt`](dsa/src/main/java/com/nyinnovations/dsa/BinarySearch.kt) |

### Strings

| # | Problem | Brute Force | Optimized | File |
|---|---------|-------------|-----------|------|
| 1 | Palindrome String | Reverse & compare — O(n) time, O(n) space | Two pointers — O(n) time, O(1) space | [`PalindromeString.kt`](dsa/src/main/java/com/nyinnovations/dsa/PalindromeString.kt) |
| 2 | Two Sum | Nested loops — O(n²) time, O(1) space | HashMap — O(n) time, O(n) space | [`TwoSum.kt`](dsa/src/main/java/com/nyinnovations/dsa/TwoSum.kt) |
| 3 | Anagram Check | Sort and compare — O(n log n) time, O(n) space | Frequency count — O(n) time, O(1) space | [`AnagramCheck.kt`](dsa/src/main/java/com/nyinnovations/dsa/AnagramCheck.kt) |
| 4 | Reverse String | Character array reversal — O(n) time, O(n) space | StringBuilder — O(n) time, O(n) space | [`ReverseString.kt`](dsa/src/main/java/com/nyinnovations/dsa/ReverseString.kt) |
| 5 | Longest Substring Without Repeating Characters | Brute force — O(n^3) time, O(n) space | Sliding window — O(n) time, O(n) space | [`LongestSubstringWithoutRepeatingCharacters.kt`](dsa/src/main/java/com/nyinnovations/dsa/LongestSubstringWithoutRepeatingCharacters.kt) |

---

## Running a solution

Each `.kt` file has a `main()` function. You can run it directly from Android Studio by clicking the green play button next to `fun main()`, or run the unit tests from the `test/` folder.

---

## Why both approaches?

It's easy to just memorise the optimal solution and move on. But writing the brute force first forces me to actually think through the problem from scratch. Then optimizing it makes the improvement feel earned — you notice *what* was wasteful and *why* the better approach works.

For example, with palindrome checking:
- The brute force reverses the whole string and compares — it works, but you're creating an entire copy of the string in memory for no real reason.
- The two-pointer approach does the same check using just two index variables, and bails out the moment it finds a mismatch instead of always checking the full string.

---

## Structure

```
dsa/
└── src/
    ├── main/java/com/nyinnovations/dsa/    # Solution files
    └── test/java/com/nyinnovations/dsa/    # Unit tests
```

---

## Progress

- Week 1 — Palindrome String
- Week 2 — Contains Duplicate
- Week 3 — Two Sum
- Week 4 — Anagram Check
- Week 5 — Move All Zeros to End
- Week 6 — Binary Search

---

## Contributing

Contributions are welcome! If you have a solution to a new problem or an improvement to an existing one, feel free to open a Pull Request (PR). Suggestions, bug fixes, and optimizations are also appreciated. Please ensure that:

- Your code follows the structure outlined above.
- You include both brute force and optimized solutions, if applicable.
- You provide clear comments explaining your approach and tradeoffs.

Let's make this repository a great resource for learning and practicing DSA!

---

## Open for Contributions

Feel free to push your PR for any problem or suggestion. Let's collaborate and grow together!
