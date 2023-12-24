import math

def nCr(n, r):
 
  if r > n:
    raise ValueError("r must be less than or equal to n")

  n_factorial = math.factorial(n)
  r_factorial = math.factorial(r)
  n_minus_r_factorial = math.factorial(n - r)

  return n_factorial / (r_factorial * n_minus_r_factorial)

def binomial_expansion(a, b, n):
  terms = []

  for r in range(n + 1):

    coeffecient = str(a**(n - r) * b**r * nCr(n, r))  
    term = str(f" x^({n - r}) y^({r}) ")
    terms.append(coeffecient+ term)

  return terms


  
a = float(input("Enter the first coefficient: "))
b = float(input("Enter the second coefficient: "))
n = int(input("Enter the exponent: "))

terms = binomial_expansion(a, b, n)

print(" + ".join(terms) , end="")


