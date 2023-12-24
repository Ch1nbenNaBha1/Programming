input_Var = 'Hello World'

cap_case = 0
low_case = 0

for i in input_Var:
    if i.isupper():
        cap_case += 1
    elif i.islower():
        low_case += 1


print('No. of Upper case characters : ', cap_case)
print('No. of Lower case characters : ', low_case)
