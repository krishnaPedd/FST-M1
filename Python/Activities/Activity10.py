tuple1=tuple(input("Enter the values with comma separated :").split(","))
print(tuple1)
print("Elements that are divisible by 5 :")
for i in tuple1:
    if int(i) % 5 == 0:
        print(i)