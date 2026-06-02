# Regular Expression Matching

## Problem Statement

Given an input string `s` and a pattern `p`, implement regular expression matching with support for:

* `.` → Matches any single character.
* `*` → Matches zero or more occurrences of the preceding element.

The matching must cover the entire string.

### Examples

**Example 1**

```
Input: s = "aa", p = "a"
Output: false
```

**Example 2**

```
Input: s = "aa", p = "a*"
Output: true
```

**Example 3**

```
Input: s = "ab", p = ".*"
Output: true
```

---

## Approach

We use Dynamic Programming.

### DP State

`dp[i][j]` represents whether the first `i` characters of string `s` match the first `j` characters of pattern `p`.

### Base Case

```
dp[0][0] = true
```

An empty string matches an empty pattern.

### Transitions

#### Case 1: Current characters match

If:

```
s[i-1] == p[j-1]
```

or

```
p[j-1] == '.'
```

then:

```
dp[i][j] = dp[i-1][j-1]
```

#### Case 2: Pattern contains '*'

`*` can act in two ways:

1. Zero occurrences of the previous character

```
dp[i][j] = dp[i][j-2]
```

2. One or more occurrences

If previous pattern character matches current string character:

```
dp[i][j] |= dp[i-1][j]
```

---

## Time Complexity

```
O(m × n)
```

where:

* m = length of string
* n = length of pattern

## Space Complexity

```
O(m × n)
```
