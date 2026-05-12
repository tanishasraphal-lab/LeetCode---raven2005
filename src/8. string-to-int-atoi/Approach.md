# Approach - String to Integer (atoi)

## Intuition
We simulate how humans read a number from a string.

Steps:
1. Ignore leading spaces
2. Check sign (`+` or `-`)
3. Read digits one by one
4. Stop at first non-digit character
5. Handle overflow safely

---

# Step-by-Step Algorithm

## Step 1: Skip Leading Whitespaces

Move pointer until first non-space character.

```java
while(i < n && s.charAt(i) == ' ')
```

Example:
```text
"   -42"
```

Pointer moves to:
```text
-42
 ^
```

---

## Step 2: Check Sign

If character is:
- `'-'` → negative
- `'+'` → positive

Otherwise:
```text
positive by default
```

```java
if(s.charAt(i) == '-')
    sign = -1;
```

---

## Step 3: Read Digits

Extract digits while character is numeric.

```java
Character.isDigit(s.charAt(i))
```

Convert character to integer:

```java
digit = s.charAt(i) - '0'
```

Example:
```text
'7' - '0' = 7
```

---

## Step 4: Build Number

Append digit mathematically:

```java
result = result * 10 + digit;
```

Example:

```text
result = 13
digit = 7

13 * 10 + 7 = 137
```

---

## Step 5: Handle Overflow

32-bit signed integer range:

:contentReference[oaicite:0]{index=0}

Before adding a digit, check if:
```java
result * 10 + digit
```

would overflow.

If overflow:
```java
return Integer.MAX_VALUE
```
or
```java
return Integer.MIN_VALUE
```

---

# Dry Run

## Input
```text
s = "   -042"
```

---

## Step 1: Skip Spaces

```text
"   -042"
    ^
```

---

## Step 2: Detect Sign

```text
sign = -1
```

Pointer moves after `-`

---

## Step 3: Read Digits

### Read `0`
```text
result = 0
```

### Read `4`
```text
result = 4
```

### Read `2`
```text
result = 42
```

---

## Final Result

Apply sign:

```text
-42
```

---

# Another Example

## Input
```text
"1337c0d3"
```

Digits read:
```text
1337
```

Stop at:
```text
'c'
```

Output:
```text
1337
```

---

# Complexity Analysis

## Time Complexity
```text
O(n)
```

- Traverse string once.

---

## Space Complexity
```text
O(1)
```

- No extra data structures used.

---

# Pattern Used

- String Traversal
- Parsing
- Overflow Handling
- Mathematical Digit Construction

---

# Common Mistakes

## 1. Forgetting Leading Spaces
Must skip spaces before checking sign.

---

## 2. Ignoring Overflow
Can exceed integer range easily.

---

## 3. Continuing After Non-Digit
Stop immediately at first invalid character.

Example:
```text
"123abc"
```

Read only:
```text
123
```

---

## 4. Using parseInt()
Not allowed logically for this problem.
The question tests manual parsing.

---

# Key Concepts Learned

- Parsing strings manually
- Converting characters to digits
- Overflow protection
- Pointer/index traversal
- Building numbers mathematically
