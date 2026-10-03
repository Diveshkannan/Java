# Digit Count and Even/Odd Count — String Method

A Java program that counts the total number of digits, even digits, and odd digits in an input by treating the input as a **String**.

This is an alternative approach to the integer-based digit-counting method.

## Method 2

Instead of using mathematical operations such as `% 10` and `/ 10`, the program:

1. Reads the input as a `String`.
2. Finds its length.
3. Processes each character using `charAt()`.
4. Converts digit characters into numeric values.
5. Checks whether each digit is even or odd.
6. Ignores non-digit characters.

## Example

For:

```text id="d7q2xm"
399.7
```

The program processes:

```text id="3h8p4w"
3  9  9  .  7
```

The `.` is ignored because it is not a digit.

Result:

```text id="v5z1kn"
Total count = 4
Total even count = 0
Total odd count = 4
```

## Key Concept

The program uses:

```java id="m3k8qa"
number.charAt(i) - '0'
```

to convert a digit character such as `'7'` into the numeric value `7`.

It then verifies that the resulting value is within the digit range `0–9` before processing it.

## Concepts Practiced

- `String`
- `Scanner`
- `next()`
- `length()`
- `charAt()`
- `for` loops
- Character-to-number conversion
- Unicode/character representation
- `if-else`
- Modulo operator `%`
- Counters
- Input processing

## Comparison With Method 1

### Method 1 — Integer

Uses:

```text id="q8n2sc"
% 10
/ 10
while loop
```

Best suited to numeric integer input.

### Method 2 — String

Uses:

```text id="r5m9tx"
String
charAt()
for loop
character → digit conversion
```

This approach can inspect the input character-by-character and can handle non-digit characters such as a decimal point.

## Status

✅ Completed

This exercise helped me understand that the same problem can sometimes be solved using different representations and approaches.
