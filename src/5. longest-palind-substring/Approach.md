# Approach - Longest Palindromic Substring

## Intuition
A palindrome reads the same forward and backward.

For every character in the string:
- treat it as the center
- expand outward while characters match

We check:
1. Odd-length palindrome (`aba`)
2. Even-length palindrome (`abba`)

and store the longest palindrome found.

~Take every character as center
~Expand outward
~Track longest palindrome

---

## Algorithm
1. Traverse each character as center.
2. Expand left and right pointers outward.
3. Continue while:
   - left >= 0
   - right < string length
   - characters match
4. Calculate palindrome length.
5. Update longest palindrome indices.
6. Return substring.

---

## Example

### Input
```text
s = "babad"
```

### Possible Palindromes
```text
"bab"
"aba"
```

### Output
```text
"bab"
```

---

## Dry Run

### Center = 'a'

```text
b a b
↑   ↑
```

Characters match:
- expand outward
- palindrome length increases

Found:
```text
"bab"
```

---

## Time Complexity
```text
O(n²)
```

Each center may expand across the string.

---

## Space Complexity
```text
O(1)
```

No extra space used.

---

## Pattern Used
- Expand Around Center
- Two Pointers
- String Processing

---

## Why This Approach Is Preferred
- Cleaner than DP
- Uses constant space
- Easier to understand
- Common interview solution