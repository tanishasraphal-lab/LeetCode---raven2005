## Question
Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000

For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

I can be placed before V (5) and X (10) to make 4 and 9. 
X can be placed before L (50) and C (100) to make 40 and 90. 
C can be placed before D (500) and M (1000) to make 400 and 900.
Given a roman numeral, convert it to an integer.

## Example 1:
Input: s = "III"
Output: 3
Explanation: III = 3.

## Example 2:
Input: s = "LVIII"
Output: 58
Explanation: L = 50, V= 5, III = 3.

## Example 3:
Input: s = "MCMXCIV"
Output: 1994
Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.

---
 
## Constraints:
- 1 <= s.length <= 15
- s contains only the characters ('I', 'V', 'X', 'L', 'C', 'D', 'M').
- It is guaranteed that s is a valid roman numeral in the range [1, 3999].

---

## Approach: Roman to Integer

### Key Idea
Traverse the string from **right to left** and decide whether to **add or subtract** values.

---

### Rules
- If current value < previous value → **subtract**
- Else → **add**

---

### Step-by-Step

1. Create a mapping of Roman symbols to values:
   - I → 1  
   - V → 5  
   - X → 10  
   - L → 50  
   - C → 100  
   - D → 500  
   - M → 1000  

2. Initialize:
   - `result = 0`
   - `prev = 0`

3. Traverse the string from **right to left**

4. For each character:
   - Get its value (`current`)
   - If `current < prev` → subtract it  
   - Else → add it  
   - Update `prev = current`

5. Return `result`

---

### Example: "MCMXCIV"

| Char | Value | Prev | Operation | Result |
|------|------|------|----------|--------|
| V | 5 | 0 | + | 5 |
| I | 1 | 5 | - | 4 |
| C | 100 | 1 | + | 104 |
| X | 10 | 100 | - | 94 |
| M | 1000 | 10 | + | 1094 |
| C | 100 | 1000 | - | 994 |
| M | 1000 | 100 | + | 1994 |

---

### Complexity

- **Time:** O(n)
- **Space:** O(1)

---

### Why This Works
- Roman numerals use subtraction only when a smaller value appears before a larger one.  
- By scanning from right to left, we always know whether to add or subtract based on the previous value.
- Left→Right needs lookahead
- Right→Left uses previous (simpler)