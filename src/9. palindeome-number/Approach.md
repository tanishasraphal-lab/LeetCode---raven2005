## Question
Given an integer x, return true if x is a palindrome, and false otherwise.

## Example 1:
Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.

## Example 2:
Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.

## Example 3:
Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.

---
 
## Constraints:
-231 <= x <= 231 - 1


---

## Approach

Instead of converting the number to a string, this solution:

- Reverses only **half of the number**
- Compares the first half with the reversed second half

### Why this approach?

- Avoids extra space
- Prevents integer overflow
- Efficient and optimal

---

## Complexity
- **Time Complexity:** O(log n)
- **Space Complexity:** O(1)

---

## Algorithm Steps

1. If number is negative → return false
2. If number ends with 0 (but not 0) → return false
3. Reverse digits until half of the number is built
4. Compare both halves
