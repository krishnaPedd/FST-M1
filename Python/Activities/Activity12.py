def sum(num):
    if num:
        return num+sum(num-1)
    else:
        return 0
number=int(input("Enter number  :"))
sumOfNumbers=sum(number)
print(sumOfNumbers)