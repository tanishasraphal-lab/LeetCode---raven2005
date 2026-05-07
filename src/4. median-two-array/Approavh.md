# Approach - Median of Two Sorted Arrays

## Intuition
Both arrays are already sorted.

So, we can:
1. Merge them into a single sorted array.
2. Find the median from the merged array.

The median depends on the total number of elements:
- Odd length → middle element
- Even length → average of two middle elements

---

## Algorithm
1. Create a new array `merged` of size `m + n`.
2. Use two pointers:
   - `i` for `nums1`
   - `j` for `nums2`
3. Compare elements and insert the smaller one into `merged`.
4. Add remaining elements if any array is left.
5. Find median:
   - If total size is odd → return middle element
   - If even → return average of two middle elements

---

## Dry Run

### Input
```text
nums1 = [1,2]
nums2 = [3,4]
```

### Merging Process

| Step | Merged Array |
|------|---------------|
| 1 | [1] |
| 2 | [1,2] |
| 3 | [1,2,3] |
| 4 | [1,2,3,4] |

Total elements = 4

Middle elements:
```text
2 and 3
```

Median:
```text
(2 + 3) / 2 = 2.5
```

Output:
```text
2.5
```

---

## Time Complexity
```text
O(m + n)
```

We traverse both arrays once.

---

## Space Complexity
```text
O(m + n)
```

Extra merged array is used.

---

## Pattern Used
- Two Pointers
- Array Merging
- Simulation

---

## Note
The problem asks for:
```text
O(log(m+n))
```

This solution is the beginner-friendly approach using merging.

The optimized solution uses:
- Binary Search
- Partition Technique
- Time Complexity: O(log(min(m,n)))