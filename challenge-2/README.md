# Second Challenge

Read a float value with 2 decimals. This value represents a monetary value. Next, calc the lower number of bills and coins possible which the value can be decomposed. The considerated bills are 100, 50, 20, 10, 5, 2. The coins are 1, 0.50, 0.25, 0.10, 0.05, 0.01. Show the bills and coins needed.

## Input

The input file contains a float value N ( 0 <= N <= 1000000.00).

## Output

Print the minimum amount of bills and coins needed to change the initial value.

## Example

INPUT
```
576.73
```

OUTPUT
```
NOTAS:
5 nota(s)  de R$ 100.00
1 nota(s)  de R$  50.00
1 nota(s)  de R$  20.00
0 nota(s)  de R$  10.00
1 nota(s)  de R$   5.00
0 nota(s)  de R$   2.00
MOEDAS:
1 moeda(s) de R$   1.00
1 moeda(s) de R$   0.50
0 moeda(s) de R$   0.25
2 moeda(s) de R$   0.10
0 moeda(s) de R$   0.05
3 moeda(s) de R$   0.01
```