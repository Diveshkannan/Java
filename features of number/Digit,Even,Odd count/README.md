# Digit Analysis — Two Methods

A Java program that analyzes the digits of a number and calculates:

- Total number of digits
- Number of even digits
- Number of odd digits

I implemented the same problem using **two different approaches** to understand how different representations can change the way a problem is solved.

## Method 1 — Integer Approach

The input is treated as an integer.

The program repeatedly:

1. Extracts the last digit using `% 10`.
2. Checks whether the digit is even or odd.
3. Updates the appropriate counter.
4. Removes the last digit using integer division by `10`.
5. Repeats until all digits are processed.

### Concepts Practiced

- `Scanner`
- `nextInt()`
- `while` loops
- `%` modulo operator
- Integer division
- `if-else`
- Counters

---

## Method 2 — String Approach

The input is treated as a `String` instead of an integer.

The program:

1. Reads the input using `next()`.
2. Gets the length using `length()`.
3. Processes each character using `charAt()`.
4. Converts digit characters into numeric values.
5. Checks whether each digit is even or odd.
6. Ignores non-digit characters.

For example:

```text id="q8j3mz"
399.7
```

The program can process:

```text id="v2x6kp"
3  9  9  .  7
```

and ignore the decimal point.

### Key Concept

```java id="w4n9cs"
number.charAt(i) - '0'
```

This converts a digit character into its corresponding numeric value.

### Concepts Practiced

- `String`
- `next()`
- `length()`
- `charAt()`
- `for` loops
- Character-to-number conversion
- Character representation
- `%` modulo operator
- Input processing

---

## Why I Tried Two Methods

The main lesson from this exercise was that **the same logical problem can be approached differently depending on how the input is represented.**

```text id="a7k2pn"
Integer
   ↓
Mathematical digit extraction
   ↓
% 10 / 10

String
   ↓
Character-by-character processing
   ↓
charAt() / conversion
```

Trying both approaches helped me understand not just
