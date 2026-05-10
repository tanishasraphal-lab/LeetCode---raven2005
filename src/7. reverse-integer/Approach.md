# Approach - Reverse Integer

## Intuition
To reverse an integer:
- Take the last digit using `% 10`
- Add it to the reversed number
- Remove the last digit using `/ 10`

We repeat this until the number becomes `0`.

---

## Step-by-Step Algorithm

1. Initialize:
```java
int reversed = 0;
```

2. Extract last digit:
```java
digit = x % 10;
```

3. Append digit to reversed number:
```java
reversed = reversed * 10 + digit;
```

4. Remove last digit from original number:
```java
x = x / 10;
```

5. Repeat until:
```java
x == 0
```

---

## Dry Run

### Input
```text
x = 123
```

### Iteration 1
```text
digit = 3
reversed = 0 * 10 + 3 = 3
x = 12
```

### Iteration 2
```text
digit = 2
reversed = 3 * 10 + 2 = 32
x = 1
```

### Iteration 3
```text
digit = 1
reversed = 32 * 10 + 1 = 321
x = 0
```

### Output
```text
321
```

---

# Negative Number Example

### Input
```text
x = -123
```

### Process
```text
digit = -3
digit = -2
digit = -1
```

### Output
```text
-321
```

Java automatically handles negative division and modulo.

---

# Overflow Handling

32-bit signed integer range:

:contentReference[oaicite:0]{index=0}

If reversed integer exceeds this range:
```java
return 0;
```

---

## Overflow Check Logic

Before:
```java
reversed = reversed * 10 + digit;
```

Check:
```java
if(reversed > Integer.MAX_VALUE / 10 ||
   reversed < Integer.MIN_VALUE / 10)
```

This prevents integer overflow before multiplication.

---

## Complexity Analysis

### Time Complexity
```text
O(log10 n)
```
- One iteration per digit.

### Space Complexity
```text
O(1)
```
- No extra data structures used.

---

# Pattern Used
- Digit Extraction
- Mathematical Manipulation
- Overflow Checking

---

# Common Mistakes

### 1. Forgetting Overflow Check
This may cause incorrect results due to integer overflow.

---

### 2. Using String Conversion
Avoid converting integer to string.
The problem expects mathematical manipulation.

---

### 3. Wrong Update Order
Correct order:
```java
extract digit
update reversed
remove digit from x
```

---

# Key Concepts Learned

- `% 10` → extract last digit
- `/ 10` → remove last digit
- reversing numbers mathematically
- handling integer overflow safely
