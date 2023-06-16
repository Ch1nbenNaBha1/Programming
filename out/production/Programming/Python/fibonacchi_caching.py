from functools import lru_cache


@lru_cache(maxsize=1000)
def fibonacchi(n):
    # Check that the input is a positive integer
    if type(n) != int:
        raise TypeError("n must be a positive integer")
    if n < 1:
        raise TypeError("n must be a positive integer")

    # Compute the Nth term
    if n == 1:
        return 1
    elif n == 2:
        return 1
    elif n > 2:
        return fibonacchi(n-1) + fibonacchi(n-2)


for n in range(2, 1101):
    print(fibonacchi(n) / fibonacchi(n-1))
