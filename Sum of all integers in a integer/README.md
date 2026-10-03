# Digit Sum

A simple Java program that calculates the sum of all digits in a given integer.

## Example

For the number:

```text
3996
```

The program calculates:

```text
3 + 9 + 9 + 6 = 27
```

Output:

```text
Total = 27
```

## Concepts Practiced

- `while` loops
- Integer division
- Modulo operator `%`
- Variables and accumulation
- Basic Java syntax
- Console output with `System.out.println()`

## Approach

The program repeatedly takes the last digit using `% 10` and adds it to `total`.

Then integer division by `10` removes the last digit.

```text
number → get last digit → add to total → remove last digit → repeat
```

## Status

✅ Completed

This is one of my early Java practice programs while learning the fundamentals.
