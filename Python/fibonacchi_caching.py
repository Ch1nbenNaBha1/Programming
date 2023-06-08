import time as Time
start_time = Time.time()
SUM = 0

fibonacchi_cache = {}

def fibonacchi(n):
    if n in fibonacchi_cache:
        return fibonacchi_cache[n]

    if n == 1:
        value = 1
    elif n == 2:
        value = 1
    elif n > 2:
        value = fibonacchi(n-1) + fibonacchi(n-2)

    fibonacchi_cache[n] = value
    return value

for i in range(1 , 1001):
    SUM += fibonacchi(i)


print(Time.time() - start_time)
print(SUM)