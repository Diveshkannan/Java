# Digit Count and Even/Odd Digit Count

A Java program that takes an integer as input and counts:

- The total number of digits
- The number of even digits
- The number of odd digits

## Example

For the input:

```text id="q3x7ka"
3997
```

The program produces:

```text id="b8m2fz"
Total count = 4
Total even count = 0
Total odd count = 4
```

## Concepts Practiced

- `Scanner`
- `nextInt()`
- `while` loops
- `if-else`
- Modulo operator `%`
- Integer division
- Increment operators
- Counting and accumulation
- Console input and output

## Approach

The program repeatedly extracts the last digit using `% 10`.

It then checks whether the digit is even or odd and increments the appropriate counter.

Finally, integer division by `10` removes the last digit and the process continues until all digits have been processed.

```text id="w7k4pd"
Number
   ↓
Extract last digit
   ↓
Check even / odd
   ↓
Update counter
   ↓
Remove last digit
   ↓
Repeat
```

## Status

✅ Completed

Another Java practice exercise focused on loops, conditions, digit manipulation, and user input.
