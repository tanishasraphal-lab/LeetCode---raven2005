# Approach - Zigzag Conversion

## Intuition
We simulate the zigzag writing process row by row.

- Characters move:
  - downward ↓ through the rows
  - then diagonally upward ↑
- Repeat this pattern until all characters are placed.

Instead of creating a 2D matrix, we store characters directly in separate rows using `StringBuilder`.

---

## Step-by-Step Algorithm

1. Handle edge cases:
   - If `numRows == 1`
   - Or string length is smaller than number of rows
   - Return original string.

2. Create an array of `StringBuilder`
   - Each index represents one row.

3. Traverse every character in the string:
   - Add character to current row.
   - If top row or bottom row is reached:
     - Reverse direction.
   - Move row pointer accordingly.

4. Combine all rows into one final string.

---

## Dry Run

### Input
```text
s = "PAYPALISHIRING"
numRows = 3
```

### Zigzag Formation
```text
P   A   H   N
A P L S I I G
Y   I   R
```

### Row Storage
```text
Row 0 -> "PAHN"
Row 1 -> "APLSIIG"
Row 2 -> "YIR"
```

### Final Output
```text
"PAHNAPLSIIGYIR"
```

---

## Direction Logic

We use:
```java
boolean goingDown
```

- `true` → move downward
- `false` → move upward

Direction changes when:
- current row = 0
- current row = numRows - 1

---

## Complexity Analysis

### Time Complexity
```text
O(n)
```
- Each character is processed once.

### Space Complexity
```text
O(n)
```
- Extra storage for rows.

---

## Pattern Used
- Simulation
- String Traversal
- Direction Switching Technique

---

## Common Mistakes

### 1. Forgetting Edge Case
```java
if(numRows == 1)
```
Without this, row index may go out of bounds.

---

### 2. Wrong Direction Change
Direction must change ONLY at:
- first row
- last row

---

### 3. Using String Concatenation
Avoid:
```java
result += ch;
```

Use:
```java
StringBuilder
```
for better performance.

---

## Optimized Idea
We avoid building the full zigzag matrix.

Instead:
- directly append characters into their correct rows
- saves unnecessary space and simplifies logic
