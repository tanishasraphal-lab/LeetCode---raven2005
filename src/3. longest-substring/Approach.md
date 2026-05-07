# Approach - Longest Substring Without Repeating Characters

## Intuition
We need to find the longest substring that contains only unique characters.

A brute-force approach would check every substring, but that would be slow.

Instead, we use the **Sliding Window** technique:
- Maintain a window of unique characters.
- Expand the window using the `right` pointer.
- If a duplicate appears, shrink the window from the `left` side until the duplicate is removed.

---

## Algorithm
1. Create a `HashSet` to store unique characters.
2. Initialize:
   - `left = 0`
   - `maxLength = 0`
3. Traverse the string using `right`.
4. If current character already exists in the set:
   - Remove characters from the left side.
   - Move `left` forward.
5. Add current character to the set.
6. Update maximum length.
7. Return `maxLength`.

---

## Dry Run

### Input
```text
s = "abcabcbb"
```

| Step | Window | Length | Max |
|------|---------|--------|-----|
| a | "a" | 1 | 1 |
| b | "ab" | 2 | 2 |
| c | "abc" | 3 | 3 |
| a (duplicate) | remove old 'a' → "bca" | 3 | 3 |
| b (duplicate) | remove old 'b' → "cab" | 3 | 3 |

Final Answer = `3`

---

## Time Complexity
```text
O(n)
```
Each character is added and removed at most once.

---

## Space Complexity
```text
O(n)
```
For storing characters in the `HashSet`.

---

## Pattern Used
- Sliding Window
- Two Pointers
- HashSet for fast lookup