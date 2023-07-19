# Fourth Challenge

Your printer was infected by a virus and it's printing incorrectly. After you look to several pages printered for a while, you discover that it printing from center to borders. In other words left half of each line is printed from the middle to left margin. In the same way, right middle to each lines is beening printed from left margin to center.

Example:
```
THIS LINE IS GIBBERISH
```

It's printed as:
```
I ENIL SIHTHSIREBBIG S
```

Your task is to fix (decode) the string to print in the original mode.Assume that each line has pair number of characters.

## Input

The first line contains a integer number N that indicates the amount of next tests lines. The next N lines has the minimum 2 ab the maximum 100 characters of uppercase letters and spaces.

## Output

For each line of the input it should be printe a line in output with the line decoded.

## Example

INPUT:
```
5
I ENIL SIHTHSIREBBIG S
LEVELKAYAK
H YPPAHSYADILO
ABCDEFGHIJKLMNOPQRSTUVWXYZ
VOD OWT SNEH HCNERF EGDIRTRAP A DNA SE
```

OUTPUT:
```
THIS LINE IS GIBBERISH
LEVELKAYAK
HAPPY HOLIDAYS
MLKJIHGFEDCBAZYXWVUTSRQPON
FRENCH HENS TWO DOVES AND A PARTRIDGE
```
