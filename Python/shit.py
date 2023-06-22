sum = 0 

for i in range(601):
    if i% 7 == 0:
        sum+=i
    elif i% 9 ==0:
        sum+=i

print(sum)