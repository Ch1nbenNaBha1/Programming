#Task 1: Generate pascals Trianggle

def factorial(n):
    if n == 0:
        return 1
    else:
        return n * factorial(n-1)

def PascalsTiranlge(n):
    for i in range(n):

        for j in range(n-i+1):
            print(end=" ")
        for j in range(i+1):
            print(factorial(i)//(factorial(j)*factorial(i-j)), end=" ")
 
    # for new line
        print()


n = int(input("Enter the number of rows: "))
PascalsTiranlge(n)