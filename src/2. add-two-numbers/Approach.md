# Add Two Numbers (LeetCode #2)

## Problem Summary

You are given two non-empty linked lists representing two non-negative integers.
The digits are stored in **reverse order**, and each node contains a single digit.

Return the sum as a linked list.

---

## Intuition

This problem mimics **manual addition**:

* Add digits one by one
* Keep track of **carry**
* Build the result as a new linked list

Since digits are in reverse order, we can process from head to tail directly.

---

## Approach

### Step 1: Initialize

* Create a **dummy node** to simplify result construction
* Use a pointer `current` to build the result list
* Initialize `carry = 0`

### Step 2: Traverse both lists

Loop while:

```
l1 != null OR l2 != null OR carry != 0
```

### Step 3: Get values safely

* If a list is exhausted, treat its value as `0`

### Step 4: Compute sum

```
sum = val1 + val2 + carry
digit = sum % 10
carry = sum / 10
```

### Step 5: Build result

* Create a new node with `digit`
* Move the pointer forward

### Step 6: Move pointers

* Move `l1` and `l2` if they are not null

### Step 7: Return result

* Return `dummy.next`

---

## Dry Run

### Input:

```
l1 = [2,4,3]
l2 = [5,6,4]
```

### Process:

```
2 + 5 = 7
4 + 6 = 10 → write 0, carry 1
3 + 4 + 1 = 8
```

### Output:

```
[7,0,8]
```

---

## Complexity Analysis

* **Time Complexity:** O(max(n, m))
* **Space Complexity:** O(max(n, m))

---

## Edge Cases

* One list is longer than the other
* Final carry remains (e.g., 999 + 1 → 1000)
* Both lists contain single node `[0]`

---

## Common Mistakes

* Forgetting to process remaining `carry`
* Not handling null nodes properly
* Not using a dummy node (leads to messy code)

---

## Pattern Recognition

This problem belongs to:

* **Linked List Traversal**
* **Digit-by-digit Simulation**
* **Carry Handling**
