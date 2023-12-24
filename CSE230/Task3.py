#Task 3: Finding subsets

def find_subsets(n):
  
  subsets = []

  for i in range(2**n):

    subset = []

    for j in range(n):
      
      if (i >> j) & 1:
        subset.append(j + 1)
        
    subsets.append(subset)
    
  return subsets


n = int(input("Enter the number of elements in the set: "))
subsets = find_subsets(n)
print("The subsets are:")
for subset in subsets:
    print(subset ,end=" ")