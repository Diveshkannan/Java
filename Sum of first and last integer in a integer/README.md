# First and Last Digit Sum

A simple Java program that finds the first and last digits of an integer and calculates their sum.

## Example

For the number:

```text id="m8h3s2"
3997
```

The program finds:

```text id="f5k1qa"
First digit = 3
Last digit  = 7
```

Therefore:

```text id="z2p7rc"
3 + 7 = 10
```

Output:

```text id="v6n4kd"
Total = 10
```

## Concepts Practiced

- `while` loops
- Modulo operator `%`
- Integer division
- Extracting digits from a number
- Variables
- Basic arithmetic
- Console output with `System.out.println()`

## Approach

The last digit is obtained using `% 10`.

The program then repeatedly divides the number by `10` until only the first digit remains.

```text id="q9w2le"
number
  ↓
extract last digit
  ↓
divide by 10 repeatedly
  ↓
get first digit
  ↓
add first + last
```

## Status

✅ Completed in about 3 minutes

Another small Java practice exercise while building my programming fundamentals.
