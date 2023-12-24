import random

TotalPoints = int(input("Enter the number of random points (T): "))

pointsInsideCircle = 0

for i in range(TotalPoints):

    x = random.uniform(-1, 1)
    y = random.uniform(-1, 1)
    
    if x**2 + y**2 < 1:
        pointsInsideCircle += 1

pi_approx = (pointsInsideCircle / TotalPoints) * 4

print("Approximate value of π:", pi_approx)
