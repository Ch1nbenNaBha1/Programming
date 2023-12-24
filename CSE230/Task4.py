
import math


def nCr(n, r):
 
  if r > n:
    raise ValueError("r must be less than or equal to n")

  n_factorial = math.factorial(n)
  r_factorial = math.factorial(r)
  n_minus_r_factorial = math.factorial(n - r)

  return n_factorial / (r_factorial * n_minus_r_factorial)


def FindProbability(redBalls , blueBalls , whiteBalls , totalBallsPicked):
    probability = 0

    totalBalls = redBalls + blueBalls + whiteBalls

    if totalBallsPicked > totalBalls:
        return "Not enough balls to pick"

    ProbabilityOfAtLeastOneRed = 1 - nCr(whiteBalls + blueBalls, totalBallsPicked) / nCr(totalBalls, totalBallsPicked)
    ProbabilityOfAtLeastOneblue = 1 - nCr(whiteBalls + redBalls, totalBallsPicked) / nCr(totalBalls, totalBallsPicked)
    ProbabilityOfAtLeastOneWhite = 1 - nCr(redBalls + blueBalls, totalBallsPicked) / nCr(totalBalls, totalBallsPicked)

    probability = ProbabilityOfAtLeastOneRed * ProbabilityOfAtLeastOneblue * ProbabilityOfAtLeastOneWhite
    
    return probability


r = int(input("Enter the number of red balls: "))
b = int(input("Enter the number of blue balls: "))
w = int(input("Enter the number of white balls: "))
k = int(input("Enter the number of balls to be picked: "))

print(FindProbability(r, b, w , k ))


