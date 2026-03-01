# DSA in Kotlin

My personal DSA practice repo. The goal is to solve at least 1–2 problems every week, and for each problem I want to write both a brute force solution and an optimized one — so I actually understand the *why* behind the better approach, not just copy the optimal answer.

All solutions are in Kotlin and each file is a standalone runnable program with a `main()` that prints results for a few test cases.

---

## How each solution is structured

Every file follows the same pattern:

- **Brute force function** — the obvious first approach, usually simpler but less efficient
- **Optimized function** — the better solution with explanation of what changed and why
- **KDoc comments** on both functions with the approach, time complexity, space complexity, and tradeoffs
- **`main()`** that runs both on the same test cases so you can see the outputs side by side
- **Unit tests** in `test/` for both approaches

---

## Problems solved

### Arrays

| # | Problem | Brute Force | Optimized | File |
|---|---------|-------------|-----------|------|
| 1 | Contains Duplicate | Nested loops — O(n²) time, O(1) space | HashSet — O(n) time, O(n) space | [`ContainsDuplicate.kt`](dsa/src/main/java/com/nyinnovations/dsa/ContainsDuplicate.kt) |

### Strings

| # | Problem | Brute Force | Optimized | File |
|---|---------|-------------|-----------|------|
| 1 | Palindrome String | Reverse & compare — O(n) time, O(n) space | Two pointers — O(n) time, O(1) space | [`PalindromeString.kt`](dsa/src/main/java/com/nyinnovations/dsa/PalindromeString.kt) |

---

## Running a solution

Each `.kt` file has a `main()` function. You can run it directly from Android Studio by clicking the green play button next to `fun main()`, or run the unit tests from the `test/` folder.

---

## Why both approaches?

It's easy to just memorise the optimal solution and move on. But writing the brute force first forces me to actually think through the problem from scratch. Then optimizing it makes the improvement feel earned — you notice *what* was wasteful and *why* the better approach works.

For example, with palindrome checking:
- The brute force reverses the whole string and compares — it works, but you're creating an entire copy of the string in memory for no real reason.
- The two-pointer approach does the same check using just two index variables, and bails out the moment it finds a mismatch instead of always checking the full string.

That kind of thinking is what I'm trying to build here.

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
- ... (more coming)
